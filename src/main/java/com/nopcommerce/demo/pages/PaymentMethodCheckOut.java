package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodCheckOut extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentMethodCheckOut.class.getName());

    @CacheLookup
    @FindBy(css = "#paymentmethod_1")
    WebElement creditCard;

    @CacheLookup
    @FindBy(xpath = "//ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton;


    public void clickOnCreditCard(){
        log.info("Enter Credit card" + creditCard.toString());
        clickOnElement(creditCard);
    }
    public void clickOnContinue(){
        log.info("Click on Continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }
}
