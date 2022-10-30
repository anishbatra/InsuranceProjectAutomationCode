package com.insurance.apiTestCases;


import com.insurance.api.LocalAPIServer;
import org.testng.annotations.Test;

public class LocalAPITest {
    LocalAPIServer ls = new LocalAPIServer();
    @Test
    public void localAPITest(){
        ls.getMethod();
    }
    @Test
    public void postCallTest(){
        ls.postMethod();
    }
    @Test
    public void putCallTest(){
        ls.putMethod();
    }
}
