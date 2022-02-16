@Regression1
  Feature: Search
    Background:


    Scenario Outline: The user need to be able to search
      Given The user have navigate to the investec url
      And user enters the search value "<SearchValue>"
      When user click on the search button
      Then The search results appears
      Examples:
        | SearchValue                  |
        | understanding-interest-rates |

    Scenario: The user need to be able to navigate to the cash investment interest rates
        And the user click to navigate to the focu page
        When a user click on the investment interest rates
        Then the browser navigate to the cash investment interest rates page