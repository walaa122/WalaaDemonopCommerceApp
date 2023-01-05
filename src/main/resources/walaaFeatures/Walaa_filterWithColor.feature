@test

Feature: Logged user could filter with color

  Background: user opens chrome browser.

  Scenario: logged user could filter with red colour in Shoes Subcategory.

    And user press on Apparel from homepage.
    And user press on Shoes subcategory.
    And user press on red checkbox.
    Then user gets Shoes options with red colour.