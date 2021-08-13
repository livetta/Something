package tests;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static io.restassured.RestAssured.given;

public class PatchTest extends SampleTest
{
    @Test
    public void putRequest()
    {
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", 1);
        requestParams.put("title", "facere repellat provident");
        requestParams.put("body", "recusandae consequuntur");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestParams)
                .when()
                .put("/posts/1")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("facere repellat provident", response.jsonPath().getString("title"));
        Assertions.assertEquals("recusandae consequuntur", response.jsonPath().getString("body"));
        Assertions.assertEquals("1", response.jsonPath().getString("userId"));
        Assertions.assertEquals("1", response.jsonPath().getString("id"));
    }
}
