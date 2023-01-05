@test
Feature: User could reset his/her password successfully

  Background: user opens browser.
    And user navigates to forget password webpage.

  Scenario: user enters a valid registered email address.
    When user enters a valid email address.
    And user press on recover button.
    Then user could reset password successfully.

  Scenario: user enters invalid not registered email address.
    When user enters an invalid email address.
    And user press on recover button.
    Then user should not be able to reset password.

