package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps {

    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String menu)  {
        new HomePage().selectMenu(menu);
    }

    @Then("^I am navigated to the computers page$")
    public void iAmNavigatedToTheComputersPage() {
        Assert.assertEquals("Not navigated to the selected menu", "Computers", new DeskTopPage().getPageTitleText());
    }
}

