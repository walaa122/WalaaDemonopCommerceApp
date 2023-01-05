@test

Feature: Logged user could select different tags.

  Background: user opens chrome browser.

  Scenario: logged user could select different tags.

    And user press on Computers from homepage.

    And user press on awesome tag option.
    Then webpage redirect to products tagged with awesome.
    And text field containing products tagged with awesome shown.
    Then user press on cool tag option.
    And webpage redirect to products tagged with cool.
    And text field containing products tagged with cool shown.