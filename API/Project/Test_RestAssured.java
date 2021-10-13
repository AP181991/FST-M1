package GitHub_RestAssured;


import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Test_RestAssured {

	  RequestSpecification requestSpec;
	  ResponseSpecification responseSpec;
	  String sshkey="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDJn5X1/2YBOKNsX60yN4sE7t6/To2t4RRHnwhwjGV26s1BHl87QPiC5qGxPSITmfrbh3a4BZ18CINPL4l0TPFsxzjMxATKLwAEMa2H0uGfVz1sux8yWJaIaJWVTaWDszAmfsim/O2dgR/ORmkciRucgmTmpr3NIDcdOYQ5KJM5Rrtf1dhcdC5wYxg+g+W9nDcV+uqXh/p4VqRzqBSpBB+eJu8j4wSrvegpnyDAfh05X5sLHVZIC3dX9cZlQfwJ6yFqr2RFOy2EQ/S43GHg6/qYIPiwjTgke+6IBXOJFcwLlTiqM/n8e6hpVCa6ErxDMamWRj5R1vndriYzJSFGTckWr9Cz99lDUIGztIByP4F7PmxmG0LOJrqmFPQAAcicUpmW0FoZvIhz7SSuFpPnan/i4xwSePznWPNYXZIX94ZwDBPYnTZeY7kyKYpOP8fJThqrqZNe2sDLsizq+bESuHvsJFCShqcI2WVG/oowH4OYFJpmY6LQl6jblbSuTCEY4kE=";
	  int id;
	 
  
  @BeforeClass
  public void beforeClass() {
	// Create request specification
			requestSpec = new RequestSpecBuilder()
					.addHeader("Authorization", "token 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")
					.setContentType(ContentType.JSON).setBaseUri("https://api.github.com").build();
			responseSpec = new ResponseSpecBuilder()

					// Check response content type
					.expectContentType("application/json")
					// Build response specification
					.build();

  }
  
 @Test(priority=1)
	    public void addsshkey() {
	        
	 String reqBody = "{ \"title\": \"TestAPIKey\",  \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDJn5X1/2YBOKNsX60yN4sE7t6/To2t4RRHnwhwjGV26s1BHl87QPiC5qGxPSITmfrbh3a4BZ18CINPL4l0TPFsxzjMxATKLwAEMa2H0uGfVz1sux8yWJaIaJWVTaWDszAmfsim/O2dgR/ORmkciRucgmTmpr3NIDcdOYQ5KJM5Rrtf1dhcdC5wYxg+g+W9nDcV+uqXh/p4VqRzqBSpBB+eJu8j4wSrvegpnyDAfh05X5sLHVZIC3dX9cZlQfwJ6yFqr2RFOy2EQ/S43GHg6/qYIPiwjTgke+6IBXOJFcwLlTiqM/n8e6hpVCa6ErxDMamWRj5R1vndriYzJSFGTckWr9Cz99lDUIGztIByP4F7PmxmG0LOJrqmFPQAAcicUpmW0FoZvIhz7SSuFpPnan/i4xwSePznWPNYXZIX94ZwDBPYnTZeY7kyKYpOP8fJThqrqZNe2sDLsizq+bESuHvsJFCShqcI2WVG/oowH4OYFJpmY6LQl6jblbSuTCEY4kE=\" }";

		Response response = given().spec(requestSpec).body(reqBody).post("/user/keys");
		// Assertion with response specification
		response.then().spec(responseSpec);

		// Print response
		String body = response.getBody().asPrettyString();
		System.out.println(body);
		id = response.then().extract().path("id");
		System.out.println("Id: " + id);
		Assert.assertEquals(response.getStatusCode(), 201);
	    }

 @Test(priority = 2)
	public void GetRequest() {

		Response response = given().spec(requestSpec).get("/user/keys");
		System.out.println(response.getBody().asPrettyString());
		Reporter.log(response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
 @Test(priority = 3)
	public void DeleteRequest() {

		Response response = given().spec(requestSpec).pathParam("keyId", id).delete("/user/keys/{keyId}");
		Reporter.log(response.getBody().asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 204);
}
}
  


