package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentCheckOut extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentCheckOut.class.getName());

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYearField;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton;


    public void selectCardTypeFromDropDown(String text){
        log.info("Select card type "+ text + "from the drop down list" + cardType.toString());
        selectByVisibleTextFromDropDown(cardType,text);
    }

    public void enterCardHolderName(String text){
        log.info("Enter Card holder name "+ text + "in card holder name field" + cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField,text);
    }

    public void enterCardNumber(String text){
        log.info("Enter card number "+ text + "in card no field" + cardNumberField.toString());
        sendTextToElement(cardNumberField,text);
    }

    public void selectExpiryMonthFromDropDown(String text){
        log.info("Select expiry Month "+ text + "from dropdown" + expireMonthField.toString());
        selectByVisibleTextFromDropDown(expireMonthField,text);
    }

    public void selectExpiryYearFromDropDown(String text){
        log.info("Select expiry Year "+ text + "from dropdown" + expireYearField.toString());
        selectByVisibleTextFromDropDown(expireYearField,text);
    }

    public void enterCardCode(String text){
        log.info("Enter Card code "+ text + "in card code field" + cardCodeField.toString());
        sendTextToElement(cardCodeField,text);
    }

    public void clickOnContinueButton(){
        log.info("Click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
