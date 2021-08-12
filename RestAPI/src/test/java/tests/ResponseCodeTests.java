package tests;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;


public class ResponseCodeTests {


 @Test
public void testResponsecode()

  {
      RestAssured.when().get("https://jsonplaceholder.typicode.com")
              .then().assertThat().statusCode(200);

  }

}

