package com.insurance.api;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetAndPost {

    public void getAndPost(){
        baseURI = "https://reqres.in/api";
        given().
                get("/users/2").
                then().
                statusCode(200).
                body("data.email",equalTo("janet.weaver@reqres.in")).
                log().
                all();

    }
    public void postMethod(){
//        HashMap<String,Object> hm = new HashMap<>();
//        hm.put("name","ab");
//        hm.put("job","engineer");
        baseURI = "https://reqres.in/api";
        //System.out.println(hm);
        JSONObject request = new JSONObject();
        request.put("name","ab");
        request.put("job","engineer");
        System.out.println(request.toJSONString());
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/users").
                then().statusCode(201).
                log().
                all();
    }
}
