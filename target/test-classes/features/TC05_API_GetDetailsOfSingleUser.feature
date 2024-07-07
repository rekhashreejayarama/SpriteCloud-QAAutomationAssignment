Feature: API Testing with GET Single User
  @API
  Scenario: Verify API response for a specific GET for Single user

    Given I send a GET request to "/api/users/2"
    Then the response status code should be 200
    Then the response should have "id" as 2

