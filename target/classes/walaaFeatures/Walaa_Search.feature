@test
Feature: Logged User could search for any product

  Background: user opens chrome browser.

  Scenario: logged user should be able to search for any product.

    And user uses the search text field and enters lenovo.
    Then user clicks on the search button.
    And user redirected to a search webpage with the text entered.