package org.example.studentinfo;



import io.restassured.response.Response;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class BookingPatchTest extends TestBase {

    @Test
    public void updateStudentWithPatch(){


        Response response=given()
                .header("Content-Type","application/json")
                .pathParam("id","102")
              //  .body(studentPojo)
                .when()
                .patch("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
