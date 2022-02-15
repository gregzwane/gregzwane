@Regression
  Feature: Search

    Scenario Outline: The user need to be able to search
      Given The user have navigate to the investec url
      And user enters the search value "<SearchValue>"
      When user click on the search button
      Then The search results appears
      Examples:
        | SearchValue |
      |      cash investment rate        |