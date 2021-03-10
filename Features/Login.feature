Feature: login scenarios with parameterization

@loginParam
Scenario: to test the functionality of login button for valid input : dummy
Given I am on login page of billing
When I enter username as "user-1" and password as "pass-1"
And I click on login button of billing page
Then I should be landed to home page

@loginParam
Scenario: to test the functionality of login button for invalid input : dummy
Given I am on login page of billing
  When I enter username as "user-2" and password as "pass-2"
And I click on login button of billing page
Then I should get error message

  @loginParam
Scenario: to test the functionality of login button for valid input : dummy
Given I am on login page of billing
    When I enter username as " " and password as " "
And I click on login button of billing page
Then I should get another error message
