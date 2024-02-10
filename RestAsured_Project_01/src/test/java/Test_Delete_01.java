
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;
import java.util.Map;


public class Test_Delete_01 {

	
	@Test
	public void test_post_01()
	{
	// use some json library to pass the payload in Post request.
	// or you can create Map and convert into Json
	
	
	given()
	.when()
	.delete("https://reqres.in/api/users/2")
	.then()
	.statusCode(204).log().all();
	
	}
	
}
