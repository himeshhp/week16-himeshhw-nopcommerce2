package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static com.nopcommerce.demo.browserfactory.ManageBrowser.driver;


public class ElectronicsPageSteps {
    @When("^I mouse hover on Electronics$")
    public void iMouseHoverOnElectronics() {
        new HomePage().mouseHoverOnElectronics();
    }

    @And("^I mouse hover and click on Cell phones$")
    public void iMouseHoverAndClickOnCellPhones() {
        new HomePage().mouseHoverOnCellPhonesAndClick();
    }

    @Then("^I navigate to the Cell phones page and see text \"([^\"]*)\"$")
    public void iNavigateToTheCellPhonesPageAndSeeText(String expected) {
        Assert.assertEquals("Unable to see the Cell phones page text", expected, new CellPhonesPage().verifyCellPhonesText());
    }

    @And("^I click on the List view tab$")
    public void iClickOnTheListViewTab() {
        new CellPhonesPage().clickOnListView();
    }

    @And("^I click on the product name Nokia Lumia$")
    public void iClickOnTheProductNameNokiaLumia() throws InterruptedException {
        Thread.sleep(3000);
        new CellPhonesPage().clickOnNokiaLumia();
    }

    @And("^I am able to see the Nokia Lumia Text displayed on the page$")
    public void iAmAbleToSeeTheNokiaLumiaTextDisplayedOnThePage() {
        Assert.assertEquals("Unable to see the Nokia Lumia page text", "Nokia Lumia 1020", new NokiaLumiaPage().verifyNokiaLumiaText());
    }

    @And("^I am able to verify that the price of the cell phone is \"([^\"]*)\"$")
    public void iAmAbleToVerifyThatThePriceOfTheCellPhoneIs(String expected) {
    Assert.assertEquals("Price of the cell phone does not match", expected, new NokiaLumiaPage().verifyNokiaPrice());
    }

    @And("^I change the quantity of Nokia product to \"([^\"]*)\"$")
    public void iChangeTheQuantityOfNokiaProductTo(String qty) {
        new NokiaLumiaPage().changeNokiaQuantity( qty );
    }

    @And("^I add the nokia phone to cart$")
    public void iAddTheNokiaPhoneToCart() {
        new NokiaLumiaPage().nokiaAddToCartButton();
    }

    @And("^I am able to see the message \"([^\"]*)\"$")
    public void iAmAbleToSeeTheMessage(String expected) {
    Assert.assertEquals("Product added to cart message not seen", expected, new NokiaLumiaPage().productAddedToTheCartMessage());
    }

    @And("^I click on the cross button$")
    public void iClickOnTheCrossButton() {
        new NokiaLumiaPage().clickOnCrossButton();
    }

    @And("^I click on the shopping cart link$")
    public void iClickOnTheShoppingCartLink() {
        new NokiaLumiaPage().clickOnShoppingCartLink();
    }

    @And("^I verify the total quantity in the cart is \"([^\"]*)\"$")
    public void iVerifyTheTotalQuantityInTheCartIs(String expected) {
        Assert.assertEquals("Total in the cart does not match", expected, new ShoppingCartPage().verifyProductQuantity());
    }

    @And("^I verify the total price of the cellphone in the cart is \"([^\"]*)\"$")
    public void iVerifyTheTotalPriceOfTheCellphoneInTheCartIs(String totalPrice) {
    Assert.assertEquals("Total price does not match", totalPrice, new ConfirmOrderPage().verifyNokiaTotalPrice());
    }

    @And("^I click on the Register tab$")
    public void iClickOnTheRegisterTab() {
        new CheckOutAsGuest().clickOnRegisterTab();
    }

    @And("^I am navigated to the Register page and can see the text \"([^\"]*)\"$")
    public void iAmNavigatedToTheRegisterPageAndCanSeeTheText(String expected) {
    Assert.assertEquals("Unable to see the Register page Text", expected, new RegisterPage().verifyRegisterText());
    }

    @And("^On registration page I enter first name \"([^\"]*)\"$")
    public void onRegistrationPageIEnterFirstName(String first) {
        new RegisterPage().enterFirstName(first);
    }

    @And("^On registration page I enter Last name \"([^\"]*)\"$")
    public void onRegistrationPageIEnterLastName(String last) {
        new RegisterPage().enterLastName(last);
    }

    @And("^On registration page I enter email \"([^\"]*)\"$")
    public void onRegistrationPageIEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("^On registration page I enter password \"([^\"]*)\"$")
    public void onRegistrationPageIEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("^On registration page I enter confirm password \"([^\"]*)\"$")
    public void onRegistrationPageIEnterConfirmPassword(String confirmPass) {
        new RegisterPage().enterConfirmPassword(confirmPass);
    }

    @And("^On registration page I click on register button$")
    public void onRegistrationPageIClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^I am able to see registration complete message \"([^\"]*)\"$")
    public void iAmAbleToSeeRegistrationCompleteMessage(String expected) {
       Assert.assertEquals("", expected, new RegisterPage().verifyRegistrationText());
    }

    @And("^On registration page I click on continue button$")
    public void onRegistrationPageIClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^I click on Billing page continue button$")
    public void iClickOnBillingPageContinueButton() {
        new BillingCheckOutPage().clickOnContinueButton();
    }

    @And("^I select the shipping method second day air$")
    public void iSelectTheShippingMethodSecondDayAir() {
        new ShippingMethodCheckoutPage().clickOnRadioButtonSecondDayAir();
    }

    @And("^I click on continue button on the shipping method page$")
    public void iClickOnContinueButtonOnTheShippingMethodPage() {
        new ShippingMethodCheckoutPage().clickOnContinue();
    }

    @And("^I click on the Logout link on the homepage$")
    public void iClickOnTheLogoutLinkOnTheHomepage() {
        new HomePage().clickOnLogoutButton();
    }



    @Then("^I can confirm that I am on the url \"([^\"]*)\"$")
    public void iCanConfirmThatIAmOnTheUrl(String expected)  {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("Invalid url",expected,currentUrl );
    }

    @And("^I click on Log in link$")
    public void iClickOnLogInLink() {
        new HomePage().clickOnLoginButton();
    }

    @And("^On Login page I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void onLoginPageIEnterEmailAndPassword(String email, String password)  {
        new LoginPage().enterEmailId(email);
        new LoginPage().enterPassword(password);
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }
}
