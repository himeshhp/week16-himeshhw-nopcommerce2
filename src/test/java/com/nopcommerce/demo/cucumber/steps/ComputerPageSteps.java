package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

public class ComputerPageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I select \"([^\"]*)\" menu$")
    public void iSelectMenu(String computerMenu) {
        new HomePage().selectMenu(computerMenu);
    }

    @And("^I click on Desktops sub menu$")
    public void iClickOnDesktopsSubMenu() {
        new HomePage().clickOnDeskTop();
    }

    @And("^I select sort by \"([^\"]*)\"$")
    public void iSelectSortBy(String sortByName) {
        new DeskTopPage().selectSortByName(sortByName);
    }

    @Then("^I am able to see that the products are arranged by Name Z to A$")
    public void iAmAbleToSeeThatTheProductsAreArrangedByNameZToA() {
        Map<String, ArrayList> mapArrays = new DeskTopPage().arrangeProductInDescendingOrder();
        Assert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));
    }

    @And("^I click on Build your own computer and add it to cart$")
    public void iClickOnBuildYourOwnComputerAndAddItToCart() throws InterruptedException{
        Thread.sleep(3000);
        new DeskTopPage().clickOnAddToCart();
    }

    @And("^I am able to verify that I have navigated to the \"([^\"]*)\" page$")
    public void iAmAbleToVerifyThatIHaveNavigatedToThePage(String expected) {
        Assert.assertEquals("Not navigated to the Build your own computer page", expected, new BuildYourOwnComputerPage().verifytheTextBuildyourowncomputer());
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select hdd- (\\d+) GB radio button$")
    public void iSelectHddGBRadioButton(int hdd) {
        new BuildYourOwnComputerPage().selectHDDRadio();
    }

    @And("^I select OS Vista Premium$")
    public void iSelectOSVistaPremium() {
        new BuildYourOwnComputerPage().selectOSRadiVistaPremium();
    }

    @And("^I select Software Microsoft Office and Total Commander$")
    public void iSelectSoftwareMicrosoftOfficeAndTotalCommander() {
        new BuildYourOwnComputerPage().selectSoftware();
    }

    @And("^I verify the price is \"([^\"]*)\"$")
    public void iVerifyThePriceIs(String expected) {
        Assert.assertEquals("Price does not match", expected, new BuildYourOwnComputerPage().verifyThePrice());
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @And("^I verify the message \"([^\"]*)\" on Top  green Bar$")
    public void iVerifyTheMessageOnTopGreenBar(String expected) {
        Assert.assertEquals("Unable to verify the product added to cart message",expected , new BuildYourOwnComputerPage().verifyTheMessageOnTopGreenBar());
    }

    @And("^I close the bar by click on the cross button$")
    public void iCloseTheBarByClickOnTheCrossButton() {
        new BuildYourOwnComputerPage().clickOnCloseBar();
    }

    @And("^I mouse hover on the Shopping cart link and click on Go to cart button$")
    public void iMouseHoverOnTheShoppingCartLinkAndClickOnGoToCartButton() {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCart();
        new BuildYourOwnComputerPage().clickOnShoppingCart();
    }

    @And("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String expected) {
        Assert.assertEquals("Not able to see the Shopping cart text", expected, new ShoppingCartPage().verifyShoppingCartText());
    }

    @And("^I change the quantity to \"([^\"]*)\"$")
    public void iChangeTheQuantityTo(String qty) throws InterruptedException {
    new ShoppingCartPage().updateQuantity(qty);
    }


    @And("^I click on the update shopping cart button$")
    public void iClickOnTheUpdateShoppingCartButton() {
        new ShoppingCartPage().updateShoppingCart();
    }

    @And("^I verify the total amount in the basket is \"([^\"]*)\"$")
    public void iVerifyTheTotalAmountInTheBasketIs(String expected) {
    Assert.assertEquals("Price does not match", expected , new ShoppingCartPage().verifyTheTotalPrice());
    }

    @And("^I click on the checkbox - I agree with the terms of service$")
    public void iClickOnTheCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expected) {
    Assert.assertEquals("", expected , new CheckOutAsGuest().verifyWelcomeText());
    }

    @And("^I click on checkout as guest tab$")
    public void iClickOnCheckoutAsGuestTab() {
        new CheckOutAsGuest().clickOnAsGuestButton();
    }

    @And("^I enter First name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
    new BillingCheckOutPage().enterBillingFirstName(firstName);
    }

    @And("^I enter Last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new BillingCheckOutPage().enterBillingLastName(lastName);
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email) {
        new BillingCheckOutPage().enterBillingEmailAddress(email);
    }

    @And("^I select Country \"([^\"]*)\" from the drop down list$")
    public void iSelectCountryFromTheDropDownList(String country) {
        new BillingCheckOutPage().selectCountryFromDropDown(country);
    }

    @And("^I enter City \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new BillingCheckOutPage().enterBillingCity(city);
    }

    @And("^I enter Address \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        new BillingCheckOutPage().enterBillingAddress(address);
    }

    @And("^I enter post code \"([^\"]*)\"$")
    public void iEnterPostCode(String postCode) {
        new BillingCheckOutPage().enterBillingZipcode(postCode);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phNo) {
        new BillingCheckOutPage().enterBillingPhoneNumber(phNo);
    }

    @And("^I click on Billing page checkout button$")
    public void iClickOnBillingPageCheckoutButton() {
        new BillingCheckOutPage().clickOnCheckOutButton();
    }

    @And("^I click on Radio button- next day air$")
    public void iClickOnRadioButtonNextDayAir() {
        new ShippingMethodCheckoutPage().clickOnRadioButtonTextDayAir();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new ShippingMethodCheckoutPage().clickOnContinue();
    }

    @And("^I click on pay by credit card$")
    public void iClickOnPayByCreditCard() {
        new PaymentMethodCheckOut().clickOnCreditCard();
    }

    @And("^I click on continue$")
    public void iClickOnContinue() {
        new PaymentMethodCheckOut().clickOnContinue();
    }

    @And("^I select \"([^\"]*)\" from the drop down$")
    public void iSelectFromTheDropDown(String cardType) {
        new PaymentCheckOut().selectCardTypeFromDropDown(cardType);
    }

    @And("^I enter card holder name \"([^\"]*)\"$")
    public void iEnterCardHolderName(String name) {
        new PaymentCheckOut().enterCardHolderName(name);
    }

    @And("^I enter Card Number \"([^\"]*)\"$")
    public void iEnterCardNumber(String cardNo) {
        new PaymentCheckOut().enterCardNumber(cardNo);
    }

    @And("^I select Expiry Month \"([^\"]*)\" from drop down$")
    public void iSelectExpiryMonthFromDropDown(String month) {
        new PaymentCheckOut().selectExpiryMonthFromDropDown(month);
    }

    @And("^I select Expiry Year \"([^\"]*)\" from drop down$")
    public void iSelectExpiryYearFromDropDown(String year) {
        new PaymentCheckOut().selectExpiryYearFromDropDown(year);
    }

    @And("^I enter card code \"([^\"]*)\"$")
    public void iEnterCardCode(String cardCode) {
        new PaymentCheckOut().enterCardCode(cardCode);
    }
    @And("^I click on payment continue button$")
    public void iClickOnPaymentContinueButton() {
        new PaymentCheckOut().clickOnContinueButton();
    }

    @And("^I confirm that the payment method is \"([^\"]*)\"$")
    public void iConfirmThatThePaymentMethodIs(String expected) {
        Assert.assertEquals("Credit Card", expected, new ConfirmOrderPage().verifyCreditCardPaymentMethod() );
    }

    @And("^I confirm that the total price is \"([^\"]*)\"$")
    public void iConfirmThatTheTotalPriceIs(String expected) {
    Assert.assertEquals("Total price does not match", expected, new ConfirmOrderPage().verifyTheTotalPrice());
    }

    @And("^I confirm that the Shipping method is \"([^\"]*)\"$")
    public void iConfirmThatTheShippingMethodIs(String expected) {
    Assert.assertEquals("Shipping method does not match", expected, new ConfirmOrderPage().verifyShippingMethod());
    }

    @And("^I click on the confirm button$")
    public void iClickOnTheConfirmButton() {
        new ConfirmOrderPage().clickOnConFirm();
    }

    @And("^I am navigated to next page and I can see \"([^\"]*)\"$")
    public void iAmNavigatedToNextPageAndICanSee(String expected) {
    Assert.assertEquals("Unable to see the Thank you text", expected , new CompletedCheckoutPage().verifyThankYouText());
    }

    @And("^I am able to see the text  \"([^\"]*)\"$")
    public void iAmAbleToSeeTheText(String expected) {
        Assert.assertEquals("Unable to see the Thank you text", expected , new CompletedCheckoutPage().verifySucessOrderText());
    }

    @And("^I click on the continue button$")
    public void iClickOnTheContinueButton() {
        new CompletedCheckoutPage().clickOnContinue();
    }

    @Then("^I am navigated to the homepage and I can see \"([^\"]*)\"$")
    public void iAmNavigatedToTheHomepageAndICanSee(String expected) {
        Assert.assertEquals("Unable to see the Homepage text", expected , new HomePage().verifyWelComeText());
    }
}
