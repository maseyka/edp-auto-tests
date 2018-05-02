package com.epam.edp.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.useRelaxedHTTPSValidation;
import static io.restassured.RestAssured.when;

public class EchoTest {

    private String endpoint;

    @BeforeClass
    @Parameters({"endpoint"})
    public void setUp(String endpoint) {
        this.endpoint = endpoint;
    }

    @Test
    public void testEcho() {
        useRelaxedHTTPSValidation();

        when().get(endpoint).
                then().
                statusCode(200);
    }


}
