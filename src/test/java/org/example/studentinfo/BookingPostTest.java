package org.example.studentinfo;



import io.restassured.response.Response;
import org.example.model.BookingPojo;
import org.example.testbase.TestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;


public class BookingPostTest extends TestBase {

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
}
