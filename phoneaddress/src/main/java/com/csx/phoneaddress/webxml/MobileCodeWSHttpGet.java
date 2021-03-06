
package com.csx.phoneaddress.webxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MobileCodeWSHttpGet", targetNamespace = "http://WebXml.com.cn/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MobileCodeWSHttpGet {


    /**
     * <br /><h3>��ù����ֻ����������ʡ�ݡ��������ֻ���������Ϣ</h3><p>���������mobileCode = �ַ������ֻ����룬����ǰ7λ���֣���userID = �ַ�������ҵ�û�ID�� ����û�Ϊ���ַ������������ݣ��ַ������ֻ����룺ʡ�� ���� �ֻ������ͣ���</p><br />
     * 
     * @param mobileCode
     * @param userID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public String getMobileCodeInfo(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "mobileCode")
        String mobileCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "userID")
        String userID);

    /**
     * <br /><h3>��ù����ֻ�������������ݿ���Ϣ</h3><p>����������ޣ��������ݣ�һά�ַ������飨ʡ�� ���� ��¼��������</p><br />
     * 
     * @return
     *     returns com.csx.phoneaddress.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getDatabaseInfo();

}
