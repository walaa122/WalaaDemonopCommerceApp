@test
Feature: Logged user could select different Categories

  Background: user opens chrome browser.

  Scenario: logged user could select category (Computers) then subcategory (Desktops)

    And user press on Computers from homepage.
    And user press on Desktops option.
    Then webpage redirects to Desktops subcategory.
    And webpage shows a Desktop computer.