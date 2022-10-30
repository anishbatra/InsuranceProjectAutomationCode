package com.insurance.api;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class LocalAPIServer {
    public void getMethod(){
        baseURI = "http://localhost:3001";
        given().get("/users").
                then().
                statusCode(200).log().all();

    }
    public void postMethod(){
        baseURI = "http://localhost:3001";
        JSONObject request = new JSONObject();
        request.put("computers","40");
        request.put("marks","100");
        request.put("grade","B");
        System.out.println(request.toJSONString());
        given().contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/subjects").then().
                statusCode(201).log().
                all();

    }
    public void putMethod(){
        baseURI = "http://localhost:3001";
        JSONObject request = new JSONObject();
        request.put("computers","140");
        request.put("marks","100");
        request.put("grade","B");
        System.out.println(request.toJSONString());
        given().contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/subjects").then().
                statusCode(201).log().
                all();

    }
}

