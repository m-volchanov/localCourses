package homeworks.homework31;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static homeworks.homework31.DateAndTimeForCreateUserPojo.isValidDateAndTime;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class ApiTestCreateWithPojo {

    @Test
    public void testCreateUser() {
        RestAssured.baseURI = "https://reqres.in/";

        CreateUserRequestPojo request = new CreateUserRequestPojo();
        request.setName("morpheus");
        request.setJob("leader");

        Response response = given()
                .contentType("application/json")
                .body(request)
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .extract()
                .response();

        CreateUserResponsePojo userResponsePojo = response.as(CreateUserResponsePojo.class);

        assertEquals(userResponsePojo.getName(), "morpheus");
        assertEquals(userResponsePojo.getJob(), "leader");
        assertNotNull(userResponsePojo.getId(), "ID should not be empty");
        assertTrue(isValidDateAndTime(userResponsePojo.getCreatedAt()), "Invalid date format for createdAt");
    }
}
