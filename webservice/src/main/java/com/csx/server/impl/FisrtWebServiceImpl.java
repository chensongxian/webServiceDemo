package com.csx.server.impl;

import com.csx.server.FisrtWebService;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @Author: csx
 * @Date: 2018/03/02
 */
@WebService
public class FisrtWebServiceImpl implements FisrtWebService{
    public String getAddressByPhoneNo(String phoneNo) {
        return phoneNo + ": 归属地是上海--";
    }
}
