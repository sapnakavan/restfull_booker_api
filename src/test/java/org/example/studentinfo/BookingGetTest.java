package org.example.studentinfo;


import io.restassured.response.Response;
import org.example.testbase.TestBase;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class BookingGetTest extends TestBase {

    @Test
    public void getAllBookingInfo() {
        Response response=given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleBookingInfo() {
    Response response=given()
            .when()
            .get("/booking/922");
    response.then().statusCode(200);
    response.prettyPrint();
    }







}
