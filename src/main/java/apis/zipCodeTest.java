package apis;

import apimodels.Location;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class zipCodeTest {

   
    @Test
    public void testVenue(){

        Location location = given().
                get("http://api.zippopotam.us/us/90210")
                .as(Location.class);

        System.out.println(location.getCountry());
        System.out.println(location.getPostcode());


    }

}
