@Regression
  Feature: SignUp new client

    Scenario Outline: As a new client I need tod be able to sign up
      Given The user have navigate to the investec url
      And the user navigate to the sign up page
      And the user provide the sign up information <"clientName"> <"clientSurname"> <"clientEmail">
      When the user click on the signup button
      Then the system create a new user on the system
      Examples:
        | clientName | clientName | clientEmail         |
        | 1          | 1             | test@investec.co.za |