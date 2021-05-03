# Author: Vijay Vignesh
# Date: May 3rd, 2021
# Description: Setting up Cucumber Framework
@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check if login is successful

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page