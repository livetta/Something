package tests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class DeleteTest extends SampleTest
{
    @Test
    public void deleteTest() {
        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .delete("/posts/1")
                .then()
                .extract().response();

        Assert.assertEquals(200, response.statusCode());
    }
}
