@CE
Feature: Clear

  @CE.01
  Scenario: Validating dividing by zero the clearing it and diivide by another number
    When I click the number nine
    And Click on division sign
    And Click zero
    And Clear
    And I click the number nine
    And Click on equal
    Then Compare the actual screenshot to the expected "CE01" CE screenshot

  @CE.02
  Scenario: Validating clearing a negative value
    When I click the minus nine
    And Clear
    And I click the number eight
    And Click on equal
    Then Compare the actual screenshot to the expected "CE02" CE screenshot