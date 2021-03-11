Feature: All registration pages

  @reg     @registration
  Scenario: to test the functionality of submit button
    Given I am on the user registration page
    When I enter below data
      | amol | ujagare | amol@gmail.com | 898989 | pune |
      | amol1 | ujagare | amol@gmail.com | 898989 | pune |
      | amol2 | ujagare | amol@gmail.com | 898989 | pune |
    And I click on submit button
    Then record should be inserted


    # parameterization using example keyword

    @multipleReg @registration
    Scenario Outline: to test the functionality of submit button
      Given I am on the user registration page
      When I enter <fName> , <lName> , <email> , <phone> , <city>
      And I click on submit button
      Then record should be inserted

      Examples:
      | fName  | lName   | email           | phone  | city      |
      | amol   | ujagare | amol@gmail.com  | 898989 | pune      |
      | rahul  | ujagare | rahul@gmail.com | 4343   | mumbai    |
      | rani   | xyz     | rani@gmail.com  | 4343   | Amaravati |
