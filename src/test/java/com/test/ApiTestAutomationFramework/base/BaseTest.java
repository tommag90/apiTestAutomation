package com.test.ApiTestAutomationFramework.base;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
    private final static String BASE_URI = "https://datausa.io/api";

    private RequestSpecification given() {
        RequestSpecification spec = new RequestSpecBuilder()
                .addFilter(new AllureRestAssured())
                .build();

        return RestAssured.given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .spec(spec);
    }
}
