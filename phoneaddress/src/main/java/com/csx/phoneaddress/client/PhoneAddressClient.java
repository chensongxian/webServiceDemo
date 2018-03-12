package com.csx.phoneaddress.client;

import com.csx.phoneaddress.webxml.MobileCodeWS;
import com.csx.phoneaddress.webxml.MobileCodeWSSoap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
public class PhoneAddressClient {
    public static void main(String[] args) {
        System.out.println(getPhoneAddress("15000814726"));
    }

    public static String getPhoneAddress(String phone){
        //1.实例化生成的服务类
        MobileCodeWS ws = new MobileCodeWS();
        //2.调用服务类的方法获取接口实例
        MobileCodeWSSoap soap = ws.getMobileCodeWSSoap();
        //3.通过接口直接获取数据
        return soap.getMobileCodeInfo(phone,"");
    }
}
