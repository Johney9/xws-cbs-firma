
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package rs.ac.uns.ftn.xws.cbs.firma;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-03-09T05:07:09.702+01:00
 * Generated source version: 2.6.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "FirmaService",
                      portName = "FirmaPort",
                      targetNamespace = "http://www.ftn.uns.ac.rs/xws/cbs/firma",
                      wsdlLocation = "file:/C:/Users/Nikola/Desktop/Fax/4 godina/2 semestar/xws/workspace/xws-cbs-firma/../xws-model/xml/wsdl/Firma.wsdl",
                      endpointInterface = "rs.ac.uns.ftn.xws.cbs.firma.FirmaPort")
                      
public class FirmaPortImpl implements FirmaPort {

    private static final Logger LOG = Logger.getLogger(FirmaPortImpl.class.getName());

    /* (non-Javadoc)
     * @see rs.ac.uns.ftn.xws.cbs.firma.FirmaPort#promet(rs.ac.uns.ftn.xws.cbs.faktura.Faktura  kupljeno )*
     */
    public rs.ac.uns.ftn.xws.cbs.faktura.Faktura promet(rs.ac.uns.ftn.xws.cbs.faktura.Faktura kupljeno) { 
        LOG.info("Executing operation promet");
        System.out.println(kupljeno);
        try {
            rs.ac.uns.ftn.xws.cbs.faktura.Faktura _return = new rs.ac.uns.ftn.xws.cbs.faktura.Faktura();
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}