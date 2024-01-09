package Assignment1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {

	public static void main(String[] args) {
		// End point URL
				RestAssured.baseURI = "https://reqres.in/";
				
				 //form the request body - Post
				RequestSpecification input = RestAssured.given()
				  .contentType("application/json") .when() .body("{\r\n"
				  		+ "    \"name\": \"morpheus\",\r\n"
				  		+ "    \"job\": \"leader\"\r\n"
				  		+ "}"); 
				//Initiate Response
				
				  Response response = input.post("/api/users");
				  response.prettyPrint();
				  
				  //status code
				  int statusCode = response.getStatusCode();
				  System.out.println("The Status code is : " +statusCode);

	}

}
