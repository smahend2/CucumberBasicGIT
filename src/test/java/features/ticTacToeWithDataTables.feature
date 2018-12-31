@loginWithDataTable
Feature: Playing a tic tac toe game using the data tables

  Scenario: simulate a tic tac toe by marking a X in row 2 , column 1
    Given a board like this:
      |   | 1 | 2 | 3 |
      | 1 |   |   |   |
      | 2 |   |   |   |
      | 3 |   |   |   |
    When player "X" plays in row 2, column 1
    Then the board should look like this:
      |   | 1 | 2 | 3 |
      | 1 |   |   |   |
      | 2 | X |   |   |
      | 3 |   |   |   |
