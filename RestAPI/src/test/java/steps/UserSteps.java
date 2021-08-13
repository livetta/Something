package steps;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import pojos.Address;
import pojos.Base;
import pojos.Company;
import pojos.UserPojo;
import java.util.List;
import static io.restassured.RestAssured.given;

public class UserSteps
{
    private static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
            .setBaseUri(Base.baseUri)
            .setBasePath("/users")
            .setContentType(ContentType.JSON)
            .build();

    @Step
    public static List <UserPojo> getUsers()
    {
        return given().spec(REQ_SPEC)
                .get()
                .jsonPath().getList("",UserPojo.class);
    }



}
