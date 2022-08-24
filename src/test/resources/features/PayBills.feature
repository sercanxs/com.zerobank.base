@smoke
Feature: Pay Bills page should have the following requirements

  Scenario: Pay Bills page should have the required title
    Given the user is logged in
    When the user should be able lands on "pb"
    Then this page should have the title "Zero - Pay Bills"

    Scenario Outline: User should able to complete pay operation
      Given the user is logged in
      When the user should be able lands on "pb"
      And User should able to complete pay operation "<amount>" "<date>"
      Then user should able to get this message "<message>"



      Examples:
        | amount | date | message                                 |
        | 100    | 1    | The payment was successfully submitted. |