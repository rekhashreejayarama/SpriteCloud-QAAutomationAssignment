package stepdefinitions;

import com.microsoft.playwright.BrowserContext;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.LoginPageSD;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ApiSteps {

    private Response response;

    @Given("I send a GET request to {string}")
    public void iSendAGETRequestTo(String endpoint) {
        RestAssured.baseURI = "https://reqres.in";
        response = given().when().get(endpoint).then().extract().response();
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
        response.prettyPrint();
    }

    @Then("the response should have {string} as {int}")
    public void theResponseShouldHaveAs(String key, int value) {
        assertEquals(value, response.jsonPath().getInt("data."+key));
    }

    @Then("the response {string} should be {string}")
    public void theResponseShouldBe(String key, String value) {
        assertEquals(value, response.jsonPath().getString(key));
    }

    @Given("I send a POST request to {string} with the following data")
    public void iSendAPOSTRequestToWithTheFollowingData(String endpoint, DataTable dataTable) {
        RestAssured.baseURI = "https://reqres.in";
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        response = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    @And("the response should have {string} as {string}")
    public void theResponseShouldHaveAs(String key, String value) {
        assertEquals(value, response.jsonPath().getString(key));
    }
}