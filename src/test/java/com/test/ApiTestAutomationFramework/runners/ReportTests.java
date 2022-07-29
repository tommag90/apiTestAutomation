package com.test.ApiTestAutomationFramework.runners;

import com.test.ApiTestAutomationFramework.base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static org.apache.http.HttpStatus.SC_OK;

public class ReportTests extends BaseTest {

    @Test
    public void getTheReport() {
        Response response = reportSteps.getNationPopulationReport();

        System.out.println("\n\n ============================");
        System.out.println(response.getBody().asString());
        System.out.println("============================\n\n ");

        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }

    @Test
    public void testTest() {
        Response response = RestAssured.given()
                .get("https://datausa.io/api/data?drilldowns=Nation&measures=Population")
                .then()
                .extract().response();

        System.out.println("\n\n ============================");
        System.out.println(response.getBody().asString());
        System.out.println("============================\n\n ");

        Assert.assertEquals(response.getStatusCode(), SC_OK);
    }
}