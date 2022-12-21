Feature: Electronics Page Test
  As a user I want to use the features on the Electronics page in the nop commerce website

  @Smoke @Regression
  Scenario: Verify user should be able to navigate to Cell phone page successfully
    Given I am on homepage
    When  I mouse hover on Electronics
    And   I mouse hover and click on Cell phones
    Then  I navigate to the Cell phones page and see text "Cell phones"

  @Sanity @Regression
  Scenario: Verify user is able to add product to cart and place order successfully
    Given I am on homepage
    When  I mouse hover on Electronics
    And   I mouse hover and click on Cell phones
    And   I navigate to the Cell phones page and see text "Cell phones"
    And   I click on the List view tab
    And   I click on the product name Nokia Lumia
    And   I am able to see the Nokia Lumia Text displayed on the page
    And   I am able to verify that the price of the cell phone is "$349.00"
    And   I change the quantity of Nokia product to "2"
    And   I add the nokia phone to cart
    And   I am able to see the message "The product has been added to your shopping cart"
    And   I click on the cross button
    And   I click on the shopping cart link
    And   I verify the message "Shopping cart"
    And   I verify the total quantity in the cart is "2"
    And   I verify the total price of the cellphone in the cart is "$698.00"
    And   I click on the checkbox - I agree with the terms of service
    And   I click on checkout button
    And   I verify the text "Welcome, Please Sign In!"
    And   I click on the Register tab
    And   I am navigated to the Register page and can see the text "Register"
    And   On registration page I enter first name "Abc"
    And   On registration page I enter Last name "Xyz"
    And   On registration page I enter email "test123@gmail.com"
    And   On registration page I enter password "test123"
    And   On registration page I enter confirm password "test123"
    And   On registration page I click on register button
    And   I am able to see registration complete message "Your registration completed"
    And   On registration page I click on continue button
    And   I verify the message "Shopping cart"
    And   I click on Log in link
    And   On Login page I enter email "test123@gmail.com" and password "test123"
    And   I click on the login button
    And   I click on the checkbox - I agree with the terms of service
    And   I click on checkout button
    And   I select Country "United Kingdom" from the drop down list
    And   I enter City "London"
    And   I enter Address "10 Downing Street"
    And   I enter post code "EC1B 2JL"
    And   I enter phone number "0987654321"
    And   I click on Billing page continue button
    And   I select the shipping method second day air
    And   I click on continue button on the shipping method page
    And   I click on pay by credit card
    And   I click on continue
    And   I select "Visa" from the drop down
    And   I enter card holder name "Abc Xyz"
    And   I enter Card Number "4222222222222"
    And   I select Expiry Month "02" from drop down
    And   I select Expiry Year "2025" from drop down
    And   I enter card code "082"
    And   I click on payment continue button
    And   I confirm that the payment method is "Credit Card"
    And   I confirm that the Shipping method is "2nd Day Air"
    And   I confirm that the total price is "$698.00"
    And   I click on the confirm button
    And   I am navigated to next page and I can see "Thank you"
    And   I am able to see the text  "Your order has been successfully processed!"
    And   I click on the continue button
    And   I am navigated to the homepage and I can see "Welcome to our store"
    And   I click on the Logout link on the homepage
    Then  I can confirm that I am on the url "https://demo.nopcommerce.com/"










