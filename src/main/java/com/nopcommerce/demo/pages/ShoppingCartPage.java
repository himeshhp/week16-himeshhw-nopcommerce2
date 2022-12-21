package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal'][text()='$2,950.00']")
    WebElement price;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkboxTerms;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement productQuantityText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement totalPrice;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement quantity;


    public String verifyShoppingCartText() {
        log.info("Verify Shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void updateQuantity(String qty) throws InterruptedException {
        Thread.sleep(3000);
        log.info("Update the quantity of product in shopping cart" + quantity.toString());
        WebElement Quantity = quantity;
        Quantity.clear();
        Quantity.sendKeys(qty);
    }

    public void updateShoppingCart(){
        log.info("Click on update Shopping cart button" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String verifyTheTotalPrice() {
        log.info("Verify the total price" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnCheckBox(){
        log.info("Click on Check box" + checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }

    public void clickOnCheckOutButton(){
        log.info("Click on checkout button" + checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyProductQuantity(){
        WebElement wb = productQuantityText;
        String actualQuantity = wb.getAttribute("value");
        log.info("Verify the product quantity" + productQuantityText.toString());
        return actualQuantity;
    }

    public String verifyTotalPrice(){
        log.info("Verify the total price" + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService(){
        log.info("Click on Terms of service box" + checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }
}
