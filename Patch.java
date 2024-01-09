package Assignment1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Patch {

	public static void main(String[] args) {
		// End point URL
				RestAssured.baseURI = "https://reqres.in/";
				
				 //form the request body - Post
				RequestSpecification input = RestAssured.given()
				  .contentType("application/json") .when() .body("{\r\n"
				  		+ "    \"name\": \"morpheus\",\r\n"
				  		+ "    \"job\": \"zion resident\"\r\n"
				  		+ "}"); 
				//Initiate Response
				
				  Response response = input.put("/api/users/2");
				  response.prettyPrint();
				  
				  //status code
				  int statusCode = response.getStatusCode();
				  System.out.println("The Status code is : " +statusCode);

	}

}
