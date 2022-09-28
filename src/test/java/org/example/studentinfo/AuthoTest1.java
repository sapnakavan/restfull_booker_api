package org.example.studentinfo;

import io.restassured.response.Response;
import org.example.model.AuthoTest;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AuthoTest1 extends TestBase {
    @Test
            public void generatetoken() {


        AuthoTest authoTest = new AuthoTest();
        authoTest.setUsername("admin");
        authoTest.setPassword("password123");


        Response response=given()
                .header("Content-Type","application/json")
                .body(authoTest)
                .when()
                .post("/auth");
        response.then();
        response.prettyPrint();
    }
}
