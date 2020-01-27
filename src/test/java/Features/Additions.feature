@Addition
Feature: Additions

  @Add.01
  Scenario: Validating adding to numbers
    When I click on a number
    And Click on th addition sign
    And Click on a second number
    And Click on equal sign
    Then Compare the actual screenshot to the expected "Add01" add screenshot

  @Add.02
  Scenario: Validating only nine numbers are taken for each input
    When I click on nine nine times
    And Click on th addition sign
    And I click on nine nine times
    And Click on equal sign
    ## As no ids exists in the canvas elements, to check if the results are correct
    ## the best approach would be to compare the screenshot with the expected one
    Then Compare the actual screenshot to the expected "Add02" add screenshot