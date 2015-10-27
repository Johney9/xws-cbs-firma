package client;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rs.ac.uns.ftn.xws.cbs.faktura.Faktura;
import rs.ac.uns.ftn.xws.cbs.faktura.FakturaStavka;
import rs.ac.uns.ftn.xws.cbs.faktura.FakturaZaglavlje;
import rs.ac.uns.ftn.xws.cbs.firma.XWSFirma;
import builders.XWSFirmWebServiceBuilder;

public class TestFirma {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcess() {
		XWSFirmWebServiceBuilder fwsb = new XWSFirmWebServiceBuilder();
		
		XWSFirma firma = fwsb.buildPort(null,null);
		
		Faktura testFaktura = new Faktura();
		
		for (int i = 0; i < 5; i++) {
			FakturaStavka fs = new FakturaStavka();
			fs.setNazivRobeIliUsluge(i+" sargarepa");
			fs.setKolicina(new BigDecimal(100));
			fs.setJedinicaMere("gram");
			fs.setRedniBroj(BigInteger.valueOf(i));
			testFaktura.getStavke().add(fs);
		}
		
		FakturaZaglavlje fz = new FakturaZaglavlje();
		fz.setBrojRacuna("123456");
		fz.setAdresaKupca("bez adrese");
		fz.setNazivKupca("kupac");
		fz.setPibKupca("12342525500");
		fz.setIdPoruke("2525500");
		fz.setPibDobavljaca("12342525500");
		fz.setNazivDobavljaca("dobavljac");
		fz.setAdresaDobavljaca("dobavljacka bb");
		
		testFaktura.setZaglavlje(fz);
		
		Faktura ret = firma.promet(testFaktura);
		System.out.println("iznos za uplatu: "+ret.getZaglavlje().getUkupnoRobaIUsluge());
	}

}
