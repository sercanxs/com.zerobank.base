@smoke
Feature: Account summary page should have the required title


  Scenario: Account summary page should have the required title
    Given the user is logged in
    When the user should be able lands on "as"
    Then this page should have the title "Zero - Account Summary"

    Scenario Outline: Account summary page should have to following account types
      Given the user is logged in
      When the user should be able lands on "as"
      Then Account summary page should have to following account types "<types>"

      Examples:
        | types               |
        | Cash Accounts       |
        | Investment Accounts |
        | Credit Accounts     |
        | Loan Accounts       |
