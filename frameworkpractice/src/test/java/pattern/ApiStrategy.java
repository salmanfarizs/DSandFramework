package pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;

public class ApiStrategy implements Capability{
	
	
	

	public void login() {
		

		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		/*BasicAuthScheme basic = new BasicAuthScheme();
		basic.setUserName("");
		basic.setPassword("");

		RestAssured.authentication = basic;*/
		
		Response res = RestAssured.given().accept(ContentType.JSON).get();
		
		JsonPath json = res.jsonPath();
		
		int data = json.get("data.id");
		
		
		System.out.println(data);
		
		
		Assert.assertEquals(200, res.getStatusCode());
		
		Assert.assertEquals(2, data);
		
		System.out.println(res.prettyPrint());
           
		}

	@Override
	public void getCurrentWindow() {
		// TODO Auto-generated method stub
		
	}
	}


