package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BillingCheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(BillingCheckOutPage.class.getName());

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNamefield;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCodeField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//div[1]/button[4]")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton;


    public void enterBillingFirstName(String text) {
        log.info("Enter billing first name" + text + firstNamefield.toString());
        sendTextToElement(firstNamefield, text);
    }

    public void enterBillingLastName(String text) {
        log.info("Enter billing last name" + text + lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterBillingEmailAddress(String text) {
        log.info("Enter billing email address" + text + emailAddressField.toString());
        sendTextToElement(emailAddressField, text);
    }

    public void selectCountryFromDropDown(String text) {
        log.info("Select Country "+ text + "from dropdown list" + countryField.toString());
        selectByVisibleTextFromDropDown(countryField, text);
    }

    public void selectStateFromDropDown(String text) {
        log.info("Select State "+ text + "from dropdown list" + stateField.toString());
        selectByValueFromDropDown(stateField, text);
    }

    public void enterBillingCity(String text) {
        log.info("Enter the City "+ text  + cityField.toString());
        sendTextToElement(cityField, text);
    }

    public void enterBillingAddress(String text) {
        log.info("Enter billing address"+ text + addressField.toString());
        sendTextToElement(addressField, text);
    }

    public void enterBillingZipcode(String text) {
        log.info("Enter zipcode "+ text + "in zip code field" + zipCodeField.toString());
        sendTextToElement(zipCodeField, text);
    }

    public void enterBillingPhoneNumber(String text) {
        log.info("Enter phone number "+ text + "in phone no field" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, text);
    }

    public void clickOnCheckOutButton() {
        log.info("Click on Checkout button" + checkout.toString());
        clickOnElement(checkout);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
