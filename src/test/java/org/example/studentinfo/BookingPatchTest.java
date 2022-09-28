package org.example.studentinfo;



import io.restassured.response.Response;
import org.example.model.BookingPojo;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class BookingPatchTest extends TestBase {

    @Test
    public void updateStudentWithPatch(){
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("Test");
        bookingPojo.setLastname("peter");
        Response response=given()
                .header("Content-Type","application/json")
                .pathParam("id","102")
                .pathParam("Token","6ceceab3890623c")
               .body(bookingPojo)
                .when()
                .patch("/{id}");
        response.then();
        response.prettyPrint();
    }
}
