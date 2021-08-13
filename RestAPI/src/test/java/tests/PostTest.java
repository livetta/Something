package tests;

import org.junit.Test;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;

public class PostTest extends SampleTest
{
    @Test
    public void sendPost() {
        JSONObject request = new JSONObject();
        request.put("userName", "chaya");
        request.put("id", 101);
        request.put("title", "recusandae consequuntur expedita");
        request.put("body", "sunt aut facere");

        System.out.println(request);

        given().
                body(request.toJSONString()).
                when().
                post("/posts").
                then().statusCode(201);

    }
}
