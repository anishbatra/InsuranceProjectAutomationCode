package com.insurance.apiTestCases;

import com.insurance.api.JsonSchemaValidating;
import org.testng.annotations.Test;

public class schemaValidatorTests {
    JsonSchemaValidating sv = new JsonSchemaValidating();
    @Test
    public void validateSchema(){
        sv.schemaValidator();
    }
}
