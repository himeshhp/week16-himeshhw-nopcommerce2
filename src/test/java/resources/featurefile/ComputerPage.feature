Feature: Computer Page Test
  As a user I want to use the different features on the Computer Page

  @Smoke @Regression
  Scenario: Verify that products arrange in an Alphabetical order when user selects sort by Name Z to A
    Given I am on homepage
    When  I select "computers" menu
    And   I click on Desktops sub menu
    And   I select sort by "Name: Z to A"
    Then  I am able to see that the products are arranged by Name Z to A

  @Sanity @Regression
  Scenario: Verify user is able to add product to shopping cart successfully
    Given I am on homepage
    When  I select "computers" menu
    And   I click on Desktops sub menu
    And   I select sort by "Name: A to Z"
    And   I click on Build your own computer and add it to cart
    And   I am able to verify that I have navigated to the "Build your own computer" page
    And   I select processor "2.2 GHz Intel Pentium Dual-Core E2200"
    And   I select ram "8GB [+$60.00]"
    And   I select hdd- 400 GB radio button
    And   I select OS Vista Premium
    And   I select Software Microsoft Office and Total Commander
    And   I verify the price is "$1,475.00"
    And   I click on add to cart button
    And   I verify the message "The product has been added to your shopping cart" on Top  green Bar
    And   I close the bar by click on the cross button
    And   I mouse hover on the Shopping cart link and click on Go to cart button
    And   I verify the message "Shopping cart"
    And   I change the quantity to "2"
    And   I click on the update shopping cart button
    And   I verify the total amount in the basket is "$2,950.00"
    And   I click on the checkbox - I agree with the terms of service
    And   I click on checkout button
    And   I verify the text "Welcome, Please Sign In!"
    And   I click on checkout as guest tab
    And   I enter First name "Abc"
    And   I enter Last name "Xyz"
    And   I enter email address "test123@gmail.com"
    And   I select Country "United Kingdom" from the drop down list
    And   I enter City "London"
    And   I enter Address "10 Downing Street"
    And   I enter post code "EC1B 2JL"
    And   I enter phone number "0987654321"
    And   I click on Billing page checkout button
    And   I click on Radio button- next day air
    And   I click on continue button
    And   I click on pay by credit card
    And   I click on continue
    And   I select "Master card" from the drop down
    And   I enter card holder name "Linda Smith"
    And   I enter Card Number "5555555555554444"
    And   I select Expiry Month "02" from drop down
    And   I select Expiry Year "2024" from drop down
    And   I enter card code "0123"
    And   I click on payment continue button
    And   I confirm that the payment method is "Credit Card"
    And   I confirm that the Shipping method is "Next Day Air"
    And   I confirm that the total price is "$2,950.00"
    And   I click on the confirm button
    And   I am navigated to next page and I can see "Thank you"
    And   I am able to see the text  "Your order has been successfully processed!"
    And   I click on the continue button
    Then  I am navigated to the homepage and I can see "Welcome to our store"


