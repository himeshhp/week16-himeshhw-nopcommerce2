package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutAsGuest extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutAsGuest.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[text()= 'Checkout as Guest']")
    WebElement guestButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement registerLink;


    public String verifyWelcomeText() {
        log.info("Verify the Welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
    public void clickOnAsGuestButton(){
        log.info("Click on proceed as guest button " + guestButton.toString());
        clickOnElement(guestButton);
    }

    public void clickOnRegisterTab(){
        log.info("Click on Register tab" + registerLink.toString());
        clickOnElement(registerLink);
    }
}
