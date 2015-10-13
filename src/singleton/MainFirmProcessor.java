package singleton;

import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import processing.DataProcessing;
import processing.XWSDataProcessor;
import processing.states.FirmState;
import processing.states.ProcessingState;
import rs.ac.uns.ftn.xws.cbs.banka_app_mapper.BankaAppMapper;
import rs.ac.uns.ftn.xws.cbs.faktura.Faktura;
import rs.ac.uns.ftn.xws.cbs.korisnik.Korisnik;
import rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje;
import util.PropertiesLoader;
import utility.MtCoupler;
import webservices.XWSBanka;
import builders.XWSBankWebServiceBuilder;
import builders.firm.NalogZaPlacanjeBuilder;
import facades.DatabaseFacade;

public class MainFirmProcessor {

	protected static final String propertiesName = "ant.properties";
    protected Properties properties;
	protected MtCoupler mtc;
	protected DataProcessing processor;
	protected ProcessingState state;
	
	private MainFirmProcessor() {
		state = new FirmState();
		properties = PropertiesLoader.load(propertiesName);
		System.out.println("properties: "+properties);
		try {
			state.initialSetup(properties);
		} catch (Exception e) {
			throw new RuntimeException("Unable to initialise firm: "+properties.getProperty("war.name")+" in database.");
		}
		
		processor = new XWSDataProcessor(state);
	}

	private static class SingletonHolder {
        private static final MainFirmProcessor INSTANCE = new MainFirmProcessor();
	}

	public static MainFirmProcessor getInstance() {
	        return SingletonHolder.INSTANCE;
	}

	public Faktura process(Faktura faktura) throws JAXBException, IOException, SAXException, Exception {
		
		Faktura retVal = (Faktura) processor.process(faktura);
		
		XWSBankWebServiceBuilder wsBuilder = new XWSBankWebServiceBuilder();
		
		DatabaseFacade dbf = new DatabaseFacade();
		
		String pibDobavljaca = retVal.getZaglavlje().getPibDobavljaca();
		System.err.println("pib dobavljaca: "+pibDobavljaca);
		Korisnik dobavljac = new Korisnik(); 
		dobavljac = dbf.readFromDatabase(dobavljac, pibDobavljaca);
		BankaAppMapper bam = dbf.readFromDatabase(new BankaAppMapper(), dobavljac.getBrojRacuna());
		
		XWSBanka banka = wsBuilder.buildPort(dobavljac.getSwiftKodBankeVlasnice(), bam.getIpAddress());
		
		NalogZaPlacanje nalog = NalogZaPlacanjeBuilder.buildNalog(faktura);
		banka.primiNalog(nalog);
		
		System.err.println("faktura vracena: "+retVal);
		return retVal;
	}
	
	

}
