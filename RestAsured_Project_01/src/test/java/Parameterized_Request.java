import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Parameterized_Request {
	
	@Test(dataProvider = "Data")
	public void test_post_01(String first_name, String subject)
	{
	// use some json library to pass the payload in Post request.
	// or you can create Map and convert into Json
		
	JSONObject request= new JSONObject();
	
	request.put("firstName", first_name);
	request.put("subject", subject);
	
	/*
		
	Map <String, Object> map= new HashMap<String, Object>();
	map.put("Name",first_name);
	map.put("Job",subject);
	
	JSONObject request= new JSONObject(map);
	System.out.println(map);
	System.out.println(request);
	
	*/
	
	given()
	.header("Content-Type" , "application/json")
	.contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString())
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201);
	
	}
	
	// To provide data from a function, we have mentioned return type Object as it can take all types of data.
	
	@DataProvider(name= "Data")
	public Object[][] dataForPost()
	{
		
		Object[][] data= new Object[2][3];   // 2 rows and 3 columns
		data[0][0]= "Minakshi";
		data[0][1]= "Math";
		
		data[1][0]= "Arun";
		data[1][1]= "Science";
		
		return data;
			
	}
	

}
