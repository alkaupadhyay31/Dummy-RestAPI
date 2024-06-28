package restAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

public class DummyRestApi {
	
	

	@Test(enabled=true, priority=1)
	public void GetEmployee() {
		
		//Get all the employee data using Rest assured : Get Method
		
		given().contentType("application/json").get("https://dummy.restapiexample.com/api/v1/employees").then().log().all();
	   
	}

   
	
    @Test(enabled=true, priority=2)
    public void Employeeid() {
    	
    	 // Get Employee data using id : Get Method
	
	given().contentType("application/json").get("https://dummy.restapiexample.com/api/v1/employee/21").then().log().all();
	
}
    
    @Test(enabled = true, priority = 3)
    
    public void CreateEmployee() {
    	
    	// Create a new employee data : Post Method
    	JSONObject js = new JSONObject();
    	js.put("name :", "test");
    	js.put("salary", "123");
    	js.put("age", "21");
    	
    	
    	given().contentType("application/json").body(js.toJSONString()).when().post("https://dummy.restapiexample.com/api/v1/create").then().log().all();
    	
    	
    }
    
    @Test(enabled=true, priority= 4)
	public void updateId() {
    	
    	// Update a newly created data : Put method
		
		JSONObject js = new JSONObject();
		js.put("name", "test");
		js.put("salary", "123");
		js.put("age", "21");
		js.put("age", "24");
		
		given().contentType("application/json").body(js.toJSONString()).when().put("https://dummy.restapiexample.com/api/v1/update/24").then().log().all();
	
	
	}
	
	@Test(enabled=true, priority = 5)
	public void deleteemployee() {
		
		// Delete a particular data using id : Delete Method
		
		given().contentType("application/json").delete("https://dummy.restapiexample.com/api/v1/delete/5").then().log().all();
		
	}
	
    
   
  }



    
