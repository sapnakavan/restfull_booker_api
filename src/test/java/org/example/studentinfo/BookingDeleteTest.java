package org.example.studentinfo;



import io.restassured.response.Response;
import org.example.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BookingDeleteTest extends TestBase {

    @Test
    public void delete(){
        Response response=given()
                .pathParam("id","3")
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
