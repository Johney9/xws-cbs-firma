
package rs.ac.uns.ftn.xws.cbs.firma;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.5
 * 2015-06-23T17:22:08.133+02:00
 * Generated source version: 2.6.5
 * 
 */
 
public class XWSFirma_XWSFirmaPort_Server{

    protected XWSFirma_XWSFirmaPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new XWSFirmaImpl();
        String address = "http://localhost:8080/Firma";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new XWSFirma_XWSFirmaPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
