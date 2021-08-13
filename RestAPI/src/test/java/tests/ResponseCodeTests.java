package tests;

import io.restassured.RestAssured;
import org.junit.Test;
import pojos.Base;

public class ResponseCodeTests extends SampleTest {


    @Test
    public void mainPageStatusCodeTest()
  {
      RestAssured.when().get(Base.baseUri)
              .then().assertThat().statusCode(200);
  }


    @Test
    public void commentsPageStatusCodeTest()
    {
        RestAssured.when().get("/comments")
                .then().assertThat().statusCode(200);
    }



}

