package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NokiaLumiaPage extends Utility {
    private static final Logger log = LogManager.getLogger(NokiaLumiaPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaPrice;

    @CacheLookup
    @FindBy(css = "#add-to-cart-button-20")
    WebElement nokiaAddToCartLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButtonLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverShoppingCart;

    @CacheLookup
    @FindBy(css = "#product_enteredQuantity_20")
    WebElement quantityField;


    public String verifyNokiaLumiaText(){
        log.info("Verify Nokia lumia Text" + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyNokiaPrice(){
        log.info("Verify Nokia price" + nokiaPrice.toString());
        return getTextFromElement(nokiaPrice);
    }

    public void changeNokiaQuantity(String qty){
        log.info("Change the quantity of nokia product" + quantityField.toString());
        quantityField.clear();
        sendTextToElement(quantityField, qty);
    }

    public void nokiaAddToCartButton(){
        log.info("Add the nokia phone to cart" + nokiaAddToCartLink.toString());
        clickOnElement(nokiaAddToCartLink);
    }

    public String productAddedToTheCartMessage(){
        log.info("Verify that the product is added to the cart message" + productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

    public void clickOnCrossButton(){
        log.info("click on the cross button" + crossButtonLink.toString());
        clickOnElement(crossButtonLink);
    }

    public void clickOnShoppingCartLink(){
        log.info("Mouse hover on Shopping cart and click on Go to cart link" + mouseHoverShoppingCart.toString() + shoppingCartLink.toString());
        mouseHoverToElement(mouseHoverShoppingCart);
        clickOnElement(shoppingCartLink);
    }
}
