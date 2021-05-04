# Author: Vijay Vignesh
# Date: May 3rd, 2021
# Description: Setting up Cucumber Framework
@SmokeScenario
Feature: feature to test login functionality

  @NonSmokeTest
  Scenario Outline: Check if login is successful with creds

    Given user is on login page
    When user enters "<username>" and "<password>" with creds
    And clicks on login button
    Then user is navigated to home page

    Examples:
    | username | password |
    | rush2vijay.g@gmail.com | Iloveamazon@4 |

  @SmokeTest
  Scenario: Check if login is successful

    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page