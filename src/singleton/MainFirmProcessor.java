package singleton;

import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.xml.sax.SAXException;

import processing.DataProcessing;
import processing.XWSDataProcessor;
import processing.states.FirmState;
import processing.states.ProcessingState;
import rs.ac.uns.ftn.xws.cbs.faktura.Faktura;
import rs.ac.uns.ftn.xws.cbs.korisnik.Korisnik;
import rs.ac.uns.ftn.xws.cbs.nalog_za_placanje.NalogZaPlacanje;
import util.PropertiesLoader;
import utility.MtCoupler;
import webservices.Banka;
import builders.BankWebServiceBuilder;
import builders.firm.NalogZaPlacanjeBuilder;
import facades.DatabaseFacade;

public class MainFirmProcessor {

	protected static final String propertiesName = "ant.properties";
    protected Properties properties = PropertiesLoader.load(propertiesName);
	protected MtCoupler mtc;
	protected DataProcessing processor;
	protected ProcessingState state;
	
	private MainFirmProcessor() {
		state = new FirmState();
		try {
			state.initialSetup(properties);
		} catch (Exception e) {
			System.err.println("Unable to store war name in database. MainProcessor.");
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
		
		BankWebServiceBuilder wsBuilder = new BankWebServiceBuilder();
		
		DatabaseFacade dbf = new DatabaseFacade();
		
		String pibDobavljaca = faktura.getZaglavlje().getPibDobavljaca();
		Korisnik dobavljac = null; 
		dobavljac = dbf.readFromDatabase(dobavljac, pibDobavljaca);
		
		Banka banka = wsBuilder.buildPort(dobavljac.getSwiftKodBankeVlasnice());
		
		NalogZaPlacanje nalog = NalogZaPlacanjeBuilder.buildNalog(faktura);
		banka.primiNalog(nalog);
		
		return retVal;
	}
	
	

}
