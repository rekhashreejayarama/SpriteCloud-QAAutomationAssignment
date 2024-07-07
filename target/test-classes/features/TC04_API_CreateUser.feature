Feature: API Testing with POST
  @API
  Scenario: Create New User using POST

    Given I send a POST request to "/api/users" with the following data
      | key       | value        |
      | name      | morpheus     |
      | job       | leader |
    Then the response status code should be 201
    And the response should have "name" as "morpheus"
    And the response should have "job" as "leader"