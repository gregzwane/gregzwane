@Regression1
  Feature: Search
    Background:
      Given The user have navigate to the investec url

    Scenario Outline: The user need to be able to search
      And user enters the search value "<SearchValue>"
      When user click on the search button
      Then The search results appears
      Examples:
        | SearchValue |
      |      cash investment rate        |

      Scenario: The user need to be able to navigate to the cash investment interest rates
        And the user click to navigate to the focu page
        When a user click on the investment interest rates
        Then the browser navigate to the cash investment interest rates page