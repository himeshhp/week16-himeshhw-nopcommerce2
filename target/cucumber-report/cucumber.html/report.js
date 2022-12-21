$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ComputerPage.feature");
formatter.feature({
  "line": 1,
  "name": "Computer Page Test",
  "description": "As a user I want to use the different features on the Computer Page",
  "id": "computer-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4353690300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify that products arrange in an Alphabetical order when user selects sort by Name Z to A",
  "description": "",
  "id": "computer-page-test;verify-that-products-arrange-in-an-alphabetical-order-when-user-selects-sort-by-name-z-to-a",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"computers\" menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Desktops sub menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select sort by \"Name: Z to A\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I am able to see that the products are arranged by Name Z to A",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 136754301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "computers",
      "offset": 10
    }
  ],
  "location": "ComputerPageSteps.iSelectMenu(String)"
});
formatter.result({
  "duration": 895758301,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iClickOnDesktopsSubMenu()"
});
formatter.result({
  "duration": 371856399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: Z to A",
      "offset": 18
    }
  ],
  "location": "ComputerPageSteps.iSelectSortBy(String)"
});
formatter.result({
  "duration": 128656299,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageSteps.iAmAbleToSeeThatTheProductsAreArrangedByNameZToA()"
});
formatter.result({
  "duration": 142719200,
  "status": "passed"
});
formatter.after({
  "duration": 648517900,
  "status": "passed"
});
formatter.uri("ElectronicsPage.feature");
formatter.feature({
  "line": 1,
  "name": "Electronics Page Test",
  "description": "As a user I want to use the features on the Electronics page in the nop commerce website",
  "id": "electronics-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2932406700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should be able to navigate to Cell phone page successfully",
  "description": "",
  "id": "electronics-page-test;verify-user-should-be-able-to-navigate-to-cell-phone-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on Electronics",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover and click on Cell phones",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the Cell phones page and see text \"Cell phones\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 20300,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsPageSteps.iMouseHoverOnElectronics()"
});
formatter.result({
  "duration": 157516499,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicsPageSteps.iMouseHoverAndClickOnCellPhones()"
});
formatter.result({
  "duration": 1027435600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 49
    }
  ],
  "location": "ElectronicsPageSteps.iNavigateToTheCellPhonesPageAndSeeText(String)"
});
formatter.result({
  "duration": 39216899,
  "status": "passed"
});
formatter.after({
  "duration": 618472699,
  "status": "passed"
});
formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Test",
  "description": "\r\nAs a user I am able to register on the nop commerce website",
  "id": "home-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3014804200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify user is able to navigate the top menu on nop commerce website",
  "description": "",
  "id": "home-page-test;verify-user-is-able-to-navigate-the-top-menu-on-nop-commerce-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    },
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select \"computers\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am navigated to the computers page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 23400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "computers",
      "offset": 10
    }
  ],
  "location": "HomePageSteps.iSelect(String)"
});
formatter.result({
  "duration": 864430800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAmNavigatedToTheComputersPage()"
});
formatter.result({
  "duration": 36190199,
  "status": "passed"
});
formatter.after({
  "duration": 672210699,
  "status": "passed"
});
});