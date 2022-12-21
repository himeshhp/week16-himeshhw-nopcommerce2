Feature: Home Page Test

  As a user I am able to register on the nop commerce website

  @Smoke @Regression
  Scenario: Verify user is able to navigate the top menu on nop commerce website
    Given  I am on homepage
    When   I select "computers"
    Then   I am navigated to the computers page


