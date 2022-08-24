@login @smoke
Feature: User should be able to login

  Scenario Outline: Login as <userType>
    Given the user is on the login page
    When the user enters the "<username>" "<password>"
    Then the user should be able to login



    Examples:
      | userType | username | password |
      | Valid    | username | password |