package com.test.ApiTestAutomationFramework.steps;

import com.test.ApiTestAutomationFramework.base.BaseSteps;
import io.restassured.response.Response;

public class ReportSteps extends BaseSteps {

    public Response getNationPopulationReport() {
//        return super.given()
        return givenOne()
//                .baseUri("https://datausa.io/api")
                .when()
                .basePath("/data")
                .queryParams("drilldowns", "Nation", "measures", "Population")
                .get()
                .then()
                .extract().response();
    }
}
