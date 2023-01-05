@test
Feature: Logged user could add different products to Wishlist

  Background: user opens chrome browser.

  Scenario: user adds two desktop products to his/her wishlist.

    And user press on Computers from homepage.
    And user press on Desktops option.

    And user clicks on add to wishlist button for 2nd product.
    And product has been added to wishlist message displayed.
    And user clicks on add to wishlist button for 3rd product.
    And product has been added to wishlist message displayed.
    Then user press on wishlist in webpage header.
    And webpage redirects to wishlist.
    And 2nd product is displayed.
    And 3rd product is displayed.

    Then user removes 2nd product from wishlist.
    And 2nd product is removed from wishlist.