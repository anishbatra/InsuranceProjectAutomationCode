package com.insurance.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class XMLSchemaValidation {


    public void schemaValidation() throws IOException {
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
                statusCode(200).log().all().
                assertThat().
                body(RestAssuredMatchers.matchesXsdInClasspath("./calculator.xsd"));

    }
}
