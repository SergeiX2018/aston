package com.postmanCollection.postmanEcho;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void getArgs_thenStatus200() {
        RestAssured.baseURI = "https://postman-echo.com";
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .log().body()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }
    @Test
    public void postData_thenStatus200() {
        RestAssured.baseURI = "https://postman-echo.com";
        String payload = "This is expected to be sent back as part of response body.";
        given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .log().body()
                .body("data", equalTo(payload));
    }

    @Test
    public void putData_thenStatus200() {
        RestAssured.baseURI = "https://postman-echo.com";
        String payload = "This is expected to be sent back as part of response body.";
        given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .log().body()
                .body("data", equalTo(payload));
    }
    @Test
    public void patchData_thenStatus200() {
        RestAssured.baseURI = "https://postman-echo.com";
        String payload = "This is expected to be sent back as part of response body.";
        given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .log().body()
                .body("data", equalTo(payload));
    }
    @Test
    public void deleteData_thenStatus200() {
        RestAssured.baseURI = "https://postman-echo.com";
        String payload = "This is expected to be sent back as part of response body.";
        given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(payload));
    }
}
