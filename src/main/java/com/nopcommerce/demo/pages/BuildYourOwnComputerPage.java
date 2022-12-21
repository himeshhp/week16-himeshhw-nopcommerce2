package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputer;

    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processorName;

    @CacheLookup
    @FindBy(name = "product_attribute_2")
    WebElement ram;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hdd;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement os;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement software;

    @CacheLookup
    @FindBy(xpath = "//span[text() = '$1,475.00']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[5]/div[1]/p[1]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[5]/div[1]/span[1]")
    WebElement closeBar;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickCart;


    public String verifytheTextBuildyourowncomputer() {
        log.info("Verify the Build your own computer page text" + buildYourOwnComputer.toString());
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectProcessor(String text) {
        log.info("Select processor "+ text + processorName.toString());
        selectByVisibleTextFromDropDown(processorName, text);
    }

    public void selectRam(String text) {
        log.info("Select ram "+ text + "from dropdown list" + ram.toString());
        selectByVisibleTextFromDropDown(ram, text);
    }

    public void selectHDDRadio(){
        log.info("select hdd radio button" + hdd.toString());
        clickOnElement(hdd);
    }

    public void selectOSRadiVistaPremium(){
        log.info("Select OS radio button" + os.toString());
        clickOnElement(os);
    }

    public void selectSoftware(){
        log.info("Select software" + software.toString());
        clickOnElement(software);
    }

    public String verifyThePrice() {
        log.info("Verify the proce" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnAddToCartButton(){
        log.info("Click on add to cart button" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyTheMessageOnTopGreenBar() {
        log.info("Verify the messge on the top green bar" + message.toString());
        return getTextFromElement(message);
    }

    public void clickOnCloseBar(){
        log.info("Click on the close bar" + closeBar.toString());
        clickOnElement(closeBar);
    }

    public void mouseHoverOnShoppingCart(){
        log.info("mouse howver on shopping cart" + shoppingCart.toString());
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnShoppingCart(){
        log.info("Click on shopping cart" + clickCart.toString());
        clickOnElement(clickCart);
    }
}
