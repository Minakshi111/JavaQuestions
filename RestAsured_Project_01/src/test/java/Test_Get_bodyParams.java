import org.junit.Test;

 import static io.restassured.RestAssured.*;
 import static io.restassured.matcher.RestAssuredMatchers.*;
 import static org.hamcrest.Matchers.*;
 
public class Test_Get_bodyParams {
	
	@Test
	public void test_get_body_001()
	{
		 given()
		 .get("https://reqres.in/api/users?page=2")
		 .then()
		 .statusCode(200)
		 .body("data[0].id", equalTo(7))
		 .body("data.id", hasItems(7,8));
	}

}