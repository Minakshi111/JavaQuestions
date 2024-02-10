
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


public class Test_Post_01 {

	
	@Test
	public void test_post_01()
	{
	// use some json library to pass the payload in Post request.
	// or you can create Map and convert into Json
	
	Map <String, Object> map= new HashMap<String, Object>();
	map.put("Name","Minakshi");
	map.put("Job","Sceince");
	
	JSONObject request= new JSONObject(map);
	System.out.println(map);
	System.out.println(request);
	
	given()
	.header("Content-Type" , "application/json")
	.contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString())
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201);
	
	}
	
}
