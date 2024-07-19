package activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity02 {

	final static String baseUri = "https://petstore.swagger.io/v2/user";

	@Test
	public void postUser() throws IOException {

		FileInputStream jsonBody = new FileInputStream("src/test/java/activities/user.json");

		String reqBody = new String(jsonBody.readAllBytes());

		Response response = given().contentType(ContentType.JSON).body(reqBody).when().post(baseUri);

		jsonBody.close();

		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("991122"));
	}

	@Test(dependsOnMethods = { "postUser" })
	public void getUser() {

		File outputJSON = new File("src/test/java/activities/userGETResponse.json");
		Response response = given().contentType(ContentType.JSON).pathParam("username", "justinc").when()
				.get(baseUri + "/{username}");

		String resBody = response.getBody().asPrettyString();

		try {
			// Create JSON file
			outputJSON.createNewFile();
			// Write response body to external file
			FileWriter writer = new FileWriter(outputJSON.getPath());
			writer.write(resBody);
			writer.close();
		} catch (IOException excp) {
			excp.printStackTrace();
		}
		response.then().body("id", equalTo(991122));
		response.then().body("username", equalTo("justinc"));
		response.then().body("firstName", equalTo("Justin"));
		response.then().body("lastName", equalTo("Case"));
		response.then().body("email", equalTo("justincase@mail.com"));
		response.then().body("password", equalTo("password123"));
		response.then().body("phone", equalTo("9812763450"));

	}

	@Test(dependsOnMethods = { "getUser" })
	public void deleteUser() {

		Response res = given().contentType(ContentType.JSON).pathParam("username", "justinc").when()
				.delete(baseUri + "/{username}");

		res.then().body("code", equalTo(200));
		res.then().body("message", equalTo("justinc"));
	}
}
