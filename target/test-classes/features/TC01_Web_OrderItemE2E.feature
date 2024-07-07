Feature: Order an Item
  Background:
    Given userSD navigates to "url"
    And userSD enters "username" username
    And userSD enters "password" password
    And userSD clicks Login button
  @WEB
  Scenario: Verify Order an Item

    When UserSD verify the logo "Swag Labs"
    When UserSD Add the item to cart
    When UserSD clicks the checkout button
    When UserSD verify the CheckoutPage title "Checkout: Your Information"
    When UserSD enters the information firstname "Antony" lastname "Selva" zipcode "1187DB"
    When UserSD verify the CheckoutOverviewPage title "Checkout: Overview"
    When Click on finish button
    When UserSD verify the CheckoutCompletePage title "Checkout: Complete!"
    Then Click on backhome button
    Then UserSD verify the logo "Swag Labs"
