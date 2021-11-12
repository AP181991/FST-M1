package activities;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
 
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity3 {
	
    RequestSpecification requestSpec;
   
    ResponseSpecification responseSpec;
 
    @BeforeClass
    public void setUp() {
       
        requestSpec = new RequestSpecBuilder()
               
                .setContentType(ContentType.JSON)
                
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                
                .build();
 
        responseSpec = new ResponseSpecBuilder()
                
                .expectStatusCode(200)
                
                .expectContentType("application/json")
                
                .expectBody("status", equalTo("alive"))
                
                .build();
    }
 
    @DataProvider
    public Object[][] petInfoProvider() {
        
        Object[][] testData = new Object[][] { 
            { 77232, "Riley", "alive" }, 
            { 77233, "Hansel", "alive" }
        };
        return testData;
    }
 
    @Test(priority=1)
   
    public void addPets() {
        String reqBody = "{\"id\": 77232, \"name\": \"Riley\", \"status\": \"alive\"}";
        Response response = given().spec(requestSpec) 
                .body(reqBody) 
                .when().post(); 
 
        reqBody = "{\"id\": 77233, \"name\": \"Hansel\", \"status\": \"alive\"}";
        response = given().spec(requestSpec) 
                .body(reqBody) 
                .when().post(); 
 
        
        response.then().spec(responseSpec); 
    }
 
    
    @Test(dataProvider = "petInfoProvider", priority=2)
    public void getPets(int id, String name, String status) {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("petId", id) // Add path parameter
                .when().get("/{petId}"); // Send GET request
 
        // Print response
        System.out.println(response.asPrettyString());
        // Assertions
        response.then()
        .spec(responseSpec) // Use responseSpec
        .body("name", equalTo(name)); // Additional Assertion
    }
 
    // Test case using a DataProvider
    @Test(dataProvider = "petInfoProvider", priority=3)
    public void deletePets(int id, String name, String status) {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("petId", id) // Add path parameter
                .when().delete("/{petId}"); // Send GET request
 
        // Assertions
        response.then().body("code", equalTo(200));
    }
 
}