Feature: Valid user Login
  Background:
    Given userSD navigates to "url"
    And userSD enters "username" username
    And userSD enters "password" password
    And userSD clicks Login button
  @WEB
  Scenario: Verify Valid User Login

    When UserSD verify the logo "Swag Labs"
    When UserSD clicks the Burger Menu
    Then UserSD clicks the logout button
