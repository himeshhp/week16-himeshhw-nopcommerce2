package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[text() = 'Cell phones']")
    WebElement cellPhonesText;

    @CacheLookup
    @FindBy(xpath = "//div/a[text()='List']")
    WebElement listViewLink;

    @CacheLookup
    @FindBy(xpath = "//h2/a[text()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;


    public String verifyCellPhonesText(){
        log.info("Verify the Cell phones page text" + cellPhonesText.toString());
        return getTextFromElement(cellPhonesText);
    }

    public void clickOnListView(){
        log.info("Click on list view" + listViewLink.toString());
        clickOnElement(listViewLink);
    }

    public void clickOnNokiaLumia(){
        log.info("Click on Nokia lumia " + nokiaLumiaText.toString());
        clickOnElement(nokiaLumiaText);
    }
}
