@feature2
Feature: Test Application - Feature 2

  Background:
    Given I open the application in array

  Scenario: Array feature validation
    When click topics covered
    Then page should be navigated to selected topics covered

