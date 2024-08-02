@feature1
Feature: Test Application - Feature 1

  Background:
    Given I open the application in login

  Scenario: verify username and password functionality with valid data
    When I entered valid username and password
    Then home page displayed

Scenario: verify username and password functionality with in valid data 
    When I entered invalid username and password
    Then popup message should be displayed