package mario.web;

import org.hamcrest.Matchers;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class MarioIntTest {

    private static final String SERVICE_URL = "http://dockerhost:8888/";
//    private static final String SERVICE_URL = "http://localhost:8080/";

    @Test
    public void simpleGet() {
        given().get(SERVICE_URL + "index.html").
                then().
                statusCode(200).
                body("html.head.title.text()", Matchers.is("Super Mario"));
    }

}
