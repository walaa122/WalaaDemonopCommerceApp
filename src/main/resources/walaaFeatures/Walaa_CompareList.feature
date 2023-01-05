@test
Feature: Logged user could add different products to Shopping cart.

  Background: user opens chrome browser.

  Scenario: Logged user add 2 products to shopping cart

    And user press on Computers from homepage.
    And user press on Desktops option.


    And user press add to cart on 2nd product choice twice.
    Then product has been added to cart message displayed.

    And user press add to cart on the 3rd product choice.
    Then product has been added to cart message displayed.

    And user press on shopping cart in header.
    Then webpage redirect to shopping cart.
    And 2nd product choice is displayed.
    And 3rd product choice is displayed.

    Then user changes quantity of the 2nd product to 5 pieces.
    And user press on update shopping cart button.
    Then product subtotal changes.


    Then user press on remove button of 2nd product.
    And user press on update shopping cart button.
    And cart total changes after removal of 2nd product.