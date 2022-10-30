package com.insurance.api;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;


public class PutPatchDeleteExamples {
    public void putMethod() {
        baseURI = "https://reqres.in/api";
        JSONObject request = new JSONObject();
        request.put("name", "abed");
        request.put("job", "QA");
        System.out.println(request.toJSONString());
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().statusCode(200).
                log().
                all();
    }

    public void patchMethod() {
        baseURI = "https://reqres.in/api";
        JSONObject request = new JSONObject();
        request.put("name", "abed");
        request.put("job", "QA1");
        System.out.println(request.toJSONString());
        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("/users/2").
                then().statusCode(200).
                log().
                all();
    }

    public void deleteMethod() {
        baseURI = "https://reqres.in";
        when().
                delete("/api/users/2").
                then().
                statusCode(204).
                log().
                all();
    }


}
