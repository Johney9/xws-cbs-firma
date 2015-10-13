package builders;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import rs.ac.uns.ftn.xws.cbs.firma.XWSFirma;
import rs.ac.uns.ftn.xws.cbs.firma.XWSFirmaService;


public class XWSFirmWebServiceBuilder implements WebServiceBuilder {

	private XWSFirmaService service;
	private static final String DEFAULT_WEBAPP_NAME="xws-firma";
	private static final String WSDL_NAME="XWSFirma?wsdl";
	protected static String WSDL_LOCATION="http://localhost:8080/"+DEFAULT_WEBAPP_NAME+"/services/"+WSDL_NAME;
	
	@Override
	public Service buildWebService(String webAppName, String ipAddress) {
		
        try {
        	
        	if(webAppName!=null && !webAppName.isEmpty()) {
        		WSDL_LOCATION.replace(DEFAULT_WEBAPP_NAME, webAppName);
        	}
        	if(ipAddress!=null && !ipAddress.isEmpty()) {
        		WSDL_LOCATION.replace("localhost", ipAddress);
        	}
			URL wsdlURL = new URL(WSDL_LOCATION);
			service = new XWSFirmaService(wsdlURL);
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
			//throw new RuntimeException(e.getCause());
		}
        
        return service;
	}
	
	
	@Override
	public XWSFirma buildPort(String webAppName, String ipAddress) {
		if(service==null) {
			buildWebService(webAppName, ipAddress);
		}
		return service.getXWSFirmaPort();
	}
	

}
