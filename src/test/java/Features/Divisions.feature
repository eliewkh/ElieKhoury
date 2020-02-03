@Division
Feature: Divisions

  @Div.01
  Scenario: Dividing by zero is not allowed
    When I click on the number nine
     And Click on the division sign
    And Click on zero
    And Click the equal sign
    Then Compare the actual screenshot to the expected "Div01" div screenshot

  @Div.02
  Scenario: Dividing the same numbers returns one
    When I click on the number nine
    And Click on the division sign
    And I click on the number nine
    And Click the equal sign
    Then Compare the actual screenshot to the expected "Div02" div screenshot

  @Div.03
  Scenario: Dividing a negative number with a positive one
    When I click on the substract sign
    And I click on the number nine
    And Click on the division sign
    And I click on the number nine
    And Click the equal sign
    Then Compare the actual screenshot to the expected "Div03" div screenshot

  @Div.04
  Scenario Outline: General function to test calculator in one scenario
    When The user enters the "<First Value>"
    And choose the "<Operation>"
    And enters the "<Second Value>"
    And click on the equal sign
    Then compare results with "<Expected Image Result>"

    Examples:
      | Operation         | First Value | Second Value | Expected Image Result |
      | divisionOperator  | 9           | 0            |  Div01                |
      | divisionOperator  | 9           | 9            |  Div02                |