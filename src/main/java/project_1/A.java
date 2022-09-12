package project_1;

import javax.xml.ws.Response;

import io.restassured.RestAssured;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class A {

	public static void main(String[] args) {

		//Defining the base URI
				RestAssured.baseURI= "https://api.nasa.gov";
				RequestSpecification httpRequest = RestAssured.given();
				
				//Passing the resource details
			//Response res =
					io.restassured.response.Response res = httpRequest.queryParam("sol","100").
					queryParam("camera", "fhaz").queryParam("api_key", "DEMO_KEY").
					get("mars-photos/api/v1/rovers/curiosity/photos");
				
				
				
				//Retrieving the response body using getBody() method
				ResponseBody body = res.body();
				
				//Converting the response body to string object
				String rbdy = body.asString();
				System.out.println(rbdy);
				
				
	}
}
