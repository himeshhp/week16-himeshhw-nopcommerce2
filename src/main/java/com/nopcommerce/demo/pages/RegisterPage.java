package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerPageText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailId;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationPageText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonText;


    public String verifyRegisterText(){
        log.info("Verify the Register page Text" + registrationPageText.toString());
        return getTextFromElement(registerPageText);
    }

    public void enterFirstName(String text){
        log.info("Enter first name" + text + " in the first name field" + firstName.toString());
        sendTextToElement(firstName,text + getRandomString(2));
    }

    public void enterLastName(String text){
        log.info("Enter Last name" + text + " in the Last name field" + lastName.toString());
        sendTextToElement(lastName,text + getRandomString(2));
    }

    public void enterEmail(String text){
        log.info("Enter email address" + text + "in the email address field" +  emailId.toString());
        sendTextToElement(emailId,text );
    }

    public void enterPassword(String text){
        log.info("Enter password" + text + " in the  password field" + password.toString());
        sendTextToElement(password,text);
    }

    public void enterConfirmPassword(String text){
        log.info("Enter Confirm password" + text + " in the confirm password field" + confirmPassword.toString());
        sendTextToElement(confirmPassword, text);
    }

    public void clickOnRegisterButton(){
        log.info("Click on Register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText(){
        log.info("verify the Registration page text" + registrationPageText.toString());
        return getTextFromElement(registrationPageText);
    }

    public void clickOnContinueButton(){
        log.info("Click on Continue button" + continueButtonText.toString());
        clickOnElement(continueButtonText);
    }
}
