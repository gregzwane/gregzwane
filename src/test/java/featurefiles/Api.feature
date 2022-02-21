@Api
  Feature: Check color
    Background: def testURL = " https://swapi.dev"

      Scenario: Test color blue and white
        Given url testURL
        And path '/api/people/'
        And request "name:R2-D2"
        When method put
        Then status 200
        And match $.metadata..result contains("R2-D2")
        And match $.metadata..result contains("white and blue.")