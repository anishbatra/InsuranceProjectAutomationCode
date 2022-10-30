package com.insurance.apiTestCases;

import com.insurance.api.SoapXMLRequest;
import org.testng.annotations.Test;

import java.io.IOException;

public class SoapXMLTests {
    SoapXMLRequest sr= new SoapXMLRequest();
    @Test
    public void soapPostMethod() throws IOException {
        sr.validateSoapXML();
    }
}
