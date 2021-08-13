package tests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;;

public class SampleTest
{
    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
