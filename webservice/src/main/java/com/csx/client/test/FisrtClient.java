package com.csx.client.test;

import com.csx.client.remote.FisrtWebServiceImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
public class FisrtClient {
    public static void main(String[] args) throws MalformedURLException {

        //TODO 也可以按照入门案例PhoneAddressClient那样调用，但是这样是不是更好呢？更具灵活性

        //FisrtWebServiceImplService是自动生成的接口，不是服务端的实现类
        Service service = Service.create(new URL("http://localhost:9999/getAddress?wsdl")
                , new QName("http://impl.server.csx.com/","FisrtWebServiceImplService"));
        FisrtWebServiceImpl impl = service.getPort(FisrtWebServiceImpl.class);
        System.out.println(impl.getAddressByPhoneNo("15000815726"));
    }
}
