package com.insurance.api;
import com.aventstack.extentreports.reporter.configuration.util.IOUtil;
import io.restassured.http.ContentType;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.*;

public class SoapXMLRequest {
    public void validateSoapXML() throws IOException {
        File file = new File("./request.xml");
        FileInputStream fileInputStream = new FileInputStream(file);
        String requestBody  = IOUtils.toString(fileInputStream,"UTF-8");

        baseURI = "http://www.dneonline.com/";
        given().contentType("text/xml").
                accept(ContentType.XML).
                body(requestBody).
                when().
                post("/calculator.asmx").
                then().
                statusCode(200).log().all();
    }
}
