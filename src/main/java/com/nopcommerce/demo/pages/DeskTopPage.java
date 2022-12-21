package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class.getName());

    @CacheLookup
    @FindBy(name = "products-orderby")
    WebElement sortByName;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);
        log.info("Get pageTitle text " + pageTitle.toString());
        return message;
    }

    public void selectSortByName(String text) {
        log.info("Select sort by " + text + sortByName.toString());
        selectByVisibleTextFromDropDown(sortByName, text);

    }

    public void clickOnAddToCart(){
        log.info("Click on add to cart button" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public Map<String, ArrayList> arrangeProductInDescendingOrder() {
        log.info("Verify that product is arranged in descending order" + sortByName.toString());
        Map<String, ArrayList> mapArrays = new HashMap<String, ArrayList>();
        List<WebElement> products = driver.findElements(By.xpath("//h2/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
//        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(sortByName, "Name: Z to A");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h2/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        mapArrays.put("originalProductsName", originalProductsName);
        mapArrays.put("afterSortByZToAProductsName", afterSortByZToAProductsName);
        return mapArrays;
    }
}
