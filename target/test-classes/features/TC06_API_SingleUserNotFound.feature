Feature: API Testing with GET Negative Scenario
  @API
  Scenario: Verify API response for a specific GET request Negative Scenario

    Given I send a GET request to "/api/users/23"
    Then the response status code should be 404