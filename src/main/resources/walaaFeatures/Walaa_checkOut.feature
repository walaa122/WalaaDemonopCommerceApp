@test
Feature: Create successful Order

  Background: user opens chrome browser.

  Scenario: Logged user could make a successful order.

    And user press on Computers from homepage.
    And user press on Desktops option.


    And user press add to cart on 2nd product choice twice.
    And product has been added to cart message displayed.

    And user press add to cart on the 3rd product choice.
    And product has been added to cart message displayed.

    And user press on shopping cart in header.
    And user press on agree with the terms of service checkbox.
    And user press on checkout button.

    Then user is redirected to checkout webpage.
    And user selects Country as Egypt.
    And user enters Cairo as City.
    And user enters his or her address.
    And user enters zip or postal code.
    And user enters his or her phone number.
    And user press on shipping address continue button.

    And user press on shipping method continue button.

    And user press on payment method continue button.

    And user press on payment information continue button.

    And user press on confirm button to confirm the order.

    Then user is redirected to checkout completed webpage.
    And order proceeded successfully message appears.

