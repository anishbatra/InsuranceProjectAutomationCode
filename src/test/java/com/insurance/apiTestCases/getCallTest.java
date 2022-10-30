package com.insurance.apiTestCases;

import com.insurance.api.GetAndPost;
import com.insurance.api.PutPatchDeleteExamples;
import com.insurance.api.firstTest;
import org.testng.annotations.Test;

public class getCallTest {
    firstTest apiTest = new firstTest();
    GetAndPost gp = new GetAndPost();
    PutPatchDeleteExamples ppde = new PutPatchDeleteExamples();
    @Test
    public void getCallValidation(){
        apiTest.getCall();
    }
    @Test
    public void getCall2Test(){
        apiTest.test2();
    }
    @Test
    public void getAndPostTest(){
        gp.getAndPost();
    }
    @Test
    public void postTest(){
        gp.postMethod();
    }
    @Test
    public void putTest(){
        ppde.putMethod();
    }
    @Test
    public void patchTest(){
        ppde.patchMethod();
    }
    @Test
    public void deleteTest(){
        ppde.deleteMethod();
    }

}
