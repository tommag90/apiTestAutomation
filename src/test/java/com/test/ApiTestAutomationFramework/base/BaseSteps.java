package com.test.ApiTestAutomationFramework.base;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseSteps {

    public final static String BASE_URI = "https://datausa.io/api";

    public RequestSpecification givenOne() {
        RequestSpecification spec = new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .addFilter(new AllureRestAssured())
                .build();


        return RestAssured
                .given()
//                .baseUri(BASE_URI)
//                .baseUri("https://datausa.io/api")
                .contentType(ContentType.JSON)
                .spec(spec);
    }
}
