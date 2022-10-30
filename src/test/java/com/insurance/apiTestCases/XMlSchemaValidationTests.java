package com.insurance.apiTestCases;

import com.insurance.api.XMLSchemaValidation;
import org.testng.annotations.Test;



import java.io.IOException;

public class XMlSchemaValidationTests {

    XMLSchemaValidation sv = new XMLSchemaValidation();
    @Test
    public void xmlSchemaValidator() throws IOException {
        sv.schemaValidation();

    }
}


