@Subtractions
Feature: Subtraction

  @Sub.01
  Scenario: Validating subtraction the same number returns 0
    When I click on number nine
    And Click on the subtraction sign
    And I click on number nine
    And Click on the equal sign
    Then Compare the actual screenshot to the expected "Sub01" sub screenshot

  @Sub.02
  Scenario: Validating subtraction for multiple numbers
    When I click on number nine
    And Click on the subtraction sign
    And I click on number nine
    And Click on the subtraction sign
    And I click on number nine
    And Click on the equal sign
    Then Compare the actual screenshot to the expected "Sub02" sub screenshot