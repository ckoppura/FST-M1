package activities;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity01 {

	static final String baseUri = "https://petstore.swagger.io/v2/pet";

	@Test(priority = 1)
	public void AddNewPet() {
		String RequestBody = "{" + "\"id\": 77232," + "\"name\": \"Riley\"," + " \"status\": \"alive\"" + "}";

		Response response = given().contentType(ContentType.JSON).body(RequestBody).when().post(baseUri);

		// Assertion
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}

	@Test(priority = 2)
	public void getPetInfo() {
		Response response = given().contentType(ContentType.JSON).when().pathParam("petId", "77232")
				.get(baseUri + "/{petId}");

		// Assertion
		response.then().body("id", equalTo(77232));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
	}

	@Test(priority = 3)
	public void deletePet() {
		Response response = given().contentType(ContentType.JSON).when().pathParam("petId", "77232")
				.delete(baseUri + "/{petId}");

		// Assertion
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("77232"));
	}

}
