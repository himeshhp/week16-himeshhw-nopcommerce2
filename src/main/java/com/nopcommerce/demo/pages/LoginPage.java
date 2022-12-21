package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;


    public void enterEmailId(String email) {
        log.info("Enter email " + email + " to email field " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }
}
