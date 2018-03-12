package com.csx.server;

import com.csx.server.impl.FisrtWebServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 发布服务
 * @Author: csx
 * @Date: 2018/03/02
 */
public class PublishServerTest {
    public static void main(String[] args) {
        //参数1：服务被访问的url   ip+端口号+服务名
        //参数2：实现类
        Endpoint.publish("http://localhost:9999/getAddress", new FisrtWebServiceImpl());
        System.out.println("服务发布成功");

        //查看WebService服务是否启动  url+？wsdl
        //http://localhost:9999/getAddress?wsdl是否能显示

    }
}
