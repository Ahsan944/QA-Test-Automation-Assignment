Feature: Login into the Sauce Demo - Swag Labs website and then proceed with the Checkout Process

  @Login
  Scenario Outline: Navigate to the Sauce Demo site and Login by using Username and Password
    Given User is Navigated to the Sauce Demo site
    When User Enter <Username>
    And User then Enter <Password>
    Then Click on Login Button
    And Verify that User has successfully logged in to the site

    Examples:
      | Username      | Password     |
      | standard_user | secret_sauce |

  @LoginAndCheckout
  Scenario Outline: Verify the E2E Checkout process on the site
    Given User is Navigated to the Sauce Demo site
    When User Enter <Username>
    And User then Enter <Password>
    Then Click on Login Button
    And Verify that User has successfully logged in to the site
    Then Add to Cart
    And Click Cart link
    And Click on the Checkout button
    Then User enter the firstname <firstName>
    And then Enter the lastname <lastName>
    And then User Enter Postal Code <postalCode>
    Then Click on the Continue button
    And Click on the Finish button
    Then Verify the Order completion with header and text message

    Examples:
      | Username      | Password     | firstName | lastName | postalCode |
      | standard_user | secret_sauce | Ahsan     | Tester   |       1234 |
