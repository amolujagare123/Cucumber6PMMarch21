Feature: All login tests

  Background: opend browser & maximize it
    Given I open the browser
    And I maximize it


  @realLogin
Scenario: to test the functionality of login button for valid input
  Given I am on login page
  When I enter correct username and correct password
  And I click on login button
  Then I should be redirected to home page



  @dummyLogin      @verifyHook
  Scenario: to test the functionality of login button for valid input : dummy
    Given I am on login page of billing
    When I enter username and password correctly
    And I click on login button of billing page
    Then I should be landed to home page

  @dummyLogin
  Scenario: to test the functionality of login button for invalid input : dummy
    Given I am on login page of billing
    When I enter username and password incorrectly
    And I click on login button of billing page
    Then I should get error message

  @dummyLogin
  Scenario: to test the functionality of login button for valid input : dummy
    Given I am on login page of billing
    When I dont enter username and password
    And I click on login button of billing page
    Then I should get another error message
