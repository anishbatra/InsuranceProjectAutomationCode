package com.insurance.api;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;


public class firstTest {
    public void getCall(){
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.asPrettyString());
        System.out.println(response.getHeader("content-type"));
        Assert.assertEquals(response.getStatusCode(),200);

    }
    public void test2(){
        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[1].id",equalTo(8)).
                log().all();
    }
}
