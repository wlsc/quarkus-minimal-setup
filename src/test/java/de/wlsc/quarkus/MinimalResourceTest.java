package de.wlsc.quarkus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MinimalResourceTest {

  @Test
  public void testHelloEndpoint() {
    given()
        .when().get("/api/hello")
        .then()
        .statusCode(200)
        .body(is("hello world"));
  }

}