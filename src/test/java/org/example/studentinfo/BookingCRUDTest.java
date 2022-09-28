package org.example.studentinfo;

import io.restassured.response.Response;
import org.example.model.BookingPojo;
import org.example.testbase.TestBase;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;


public class BookingCRUDTest extends TestBase {

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
                .get("/booking/430");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void createStudent() {

        HashMap<String,Object> booking = new HashMap<>();
        booking.put("checkin","2022-01-01");
        booking.put("check out","2022-05-05");

        BookingPojo bookingPojo = new BookingPojo();

        bookingPojo.setFirstname("Test");
        bookingPojo.setLastname("peter");
        bookingPojo.setPrice(555);
        bookingPojo.setDepositepaid(true);
        bookingPojo.setBookingdates(booking);
        bookingPojo.setAdditionalneeds("breakfast");

        Response response=given()
                .header("Content-Type","application/json")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.then();
        response.prettyPrint();
    }
    @Test
    public void updateStudentWithPatch(){
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Test12");
        bookingPojo.setLastname("peter1");
        Response response=given()
                .header("Content-Type","application/json")
                // .pathParam("Token","6ceceab3890623c")
                .body(bookingPojo)
                .when()
                .patch("/booking/1535");
        response.then();
        response.prettyPrint();
    }
    @Test
    public void delete(){
        Response response=given()
                .when()
                .delete("/booking/1535");
        response.then();
        response.prettyPrint();
    }




}