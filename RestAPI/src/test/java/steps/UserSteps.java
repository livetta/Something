package steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import pojos.UserPojo;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserSteps
{
    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
            .setBaseUri("https://jsonplaceholder.typicode.com")
            .setBasePath("/users")
            .setContentType(ContentType.JSON)
            .build();

    public static List <UserPojo> getUsers()
    {
        return given().spec(REQ_SPEC)
                .get()
                .jsonPath().getList("",UserPojo.class);
    }
}
