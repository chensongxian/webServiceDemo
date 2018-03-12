
package com.csx.client.remote;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FisrtWebServiceImplService", targetNamespace = "http://impl.server.csx.com/", wsdlLocation = "http://localhost:9999/getAddress?wsdl")
public class FisrtWebServiceImplService
    extends Service
{

    private final static URL FISRTWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException FISRTWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName FISRTWEBSERVICEIMPLSERVICE_QNAME = new QName("http://impl.server.csx.com/", "FisrtWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/getAddress?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FISRTWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        FISRTWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public FisrtWebServiceImplService() {
        super(__getWsdlLocation(), FISRTWEBSERVICEIMPLSERVICE_QNAME);
    }

    public FisrtWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FISRTWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public FisrtWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, FISRTWEBSERVICEIMPLSERVICE_QNAME);
    }

    public FisrtWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FISRTWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public FisrtWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FisrtWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FisrtWebServiceImpl
     */
    @WebEndpoint(name = "FisrtWebServiceImplPort")
    public FisrtWebServiceImpl getFisrtWebServiceImplPort() {
        return super.getPort(new QName("http://impl.server.csx.com/", "FisrtWebServiceImplPort"), FisrtWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FisrtWebServiceImpl
     */
    @WebEndpoint(name = "FisrtWebServiceImplPort")
    public FisrtWebServiceImpl getFisrtWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.server.csx.com/", "FisrtWebServiceImplPort"), FisrtWebServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FISRTWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw FISRTWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return FISRTWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
