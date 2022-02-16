@Regression1
  Feature: Search and SignUp
    Background:
      Given The user have navigate to the investec url
    Scenario Outline: The user need to be able to search
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

    Scenario Outline: As a new client I need tod be able to sign up
      And the user navigate to the sign up page
      And the user provide the sign up information <"clientName"> <"clientSurname"> <"clientEmail">
      When the user click on the signup button
      Then the system create a new user on the system
      Examples:
        | clientName | clientName | clientEmail         |
        | 1          | 1             | test@investec.co.za |