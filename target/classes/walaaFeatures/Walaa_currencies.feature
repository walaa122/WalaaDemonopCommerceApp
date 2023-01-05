@test
Feature: Logged User could switch between currencies US-Euro

  Background: user opens chrome browser.

  Scenario: logged user should be able to change currency from US Dollars to Euro & back.

    And user uses the search text field and enters lenovo.
    And user clicks on the search button.


    And user press on currency list.
    And user chooses Euro currency.
    Then item price changes to Euros.


    And user press on currency list.
    And user chooses USD currency.
    Then item price changes to USD.
