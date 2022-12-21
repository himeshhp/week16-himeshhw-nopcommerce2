package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutText;

    @CacheLookup
    @FindBy(xpath = "//div/ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']")
    WebElement electronicsTab;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhoneTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginButton;


    public void selectMenu(String menu) {
        String mainmenu = menu.toLowerCase();
        String expression = "//a[@href ='/" + mainmenu + "']";
        driver.findElement(By.xpath(expression)).click();
    }

    public void clickOnDeskTop() {
        log.info("Click on Desktop" + desktop.toString());
        clickOnElement(desktop);
    }

    public void mouseHoverOnElectronics() {
        log.info("Mouse hover on Electronics tab" + electronicsTab.toString());
        mouseHoverToElement(electronicsTab);
    }

    public void mouseHoverOnCellPhonesAndClick() {
        log.info("Mouse hover on Cell phones tab and click" + cellPhoneTab.toString());
        mouseHoverToElementAndClick(cellPhoneTab);
    }

    public String verifyWelComeText() {
        log.info("Verify the Welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogoutButton() {
        log.info("Click on Log out button" + logoutText.toString());
        clickOnElement(logoutText);
    }

    public void clickOnLoginButton(){
        log.info("Click on Log in button" + loginButton.toString());
        clickOnElement(loginButton);
    }
}