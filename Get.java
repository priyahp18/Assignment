package Assignment1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {

	public static void main(String[] args) {
		// End point URL
				RestAssured.baseURI = "https://reqres.in/";
				//Response
				Response input = RestAssured.given()
				  .contentType("application/json").get("/api/users?page=2");
				//print the response
				  input.prettyPrint();
				  
				  //status code
				  int statusCode = input.getStatusCode();
				  System.out.println("The Status code is : " +statusCode);

	}

}
