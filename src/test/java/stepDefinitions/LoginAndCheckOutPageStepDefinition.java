package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.LoginAndCheckoutPage;
import utils.TestContextSetup;

public class LoginAndCheckOutPageStepDefinition {
    public WebDriver driver;
    public LoginAndCheckoutPage loginAndCheckoutPage;
    TestContextSetup testContextSetup;

    public LoginAndCheckOutPageStepDefinition(TestContextSetup testContextSetup)
    {
        this.testContextSetup = testContextSetup;
        this.loginAndCheckoutPage = testContextSetup.pageObjectManager.getcheckoutPage();
    }

    @Given("^User is Navigated to the Sauce Demo site$")
    public void navigateToSauceDemoSite() {
        loginAndCheckoutPage.navigateToSite();
    }


    @When("^User Enter (.+)$")
    public void userEnterUsername(String name) {
        loginAndCheckoutPage.enterUsername(name);
    }

    @And("^User then Enter (.+)$")
    public void userEnterPassword(String password) {
        loginAndCheckoutPage.enterPassword(password);
    }

    @Then("^Click on Login Button$")
    public void clickOnLoginButton() {
        loginAndCheckoutPage.clickLoginButton();
    }

    @And("^Verify that User has successfully logged in to the site$")
    public void LoggedInToTheSite() {
        loginAndCheckoutPage.verifyLogin();
    }

    @Then("^Add to Cart$")
    public void addToCart() {
        loginAndCheckoutPage.clickAddToCart();
    }

    @And("^Click Cart link$")
    public void clickCartLink() {
        loginAndCheckoutPage.clickCartButton();
    }

    @And("^Click on the Checkout button$")
    public void clickOnTheCheckoutButton() {
        loginAndCheckoutPage.clickCheckoutButton();
    }

    @Then("^User enter the firstname (.+)$")
    public void userEnterTheFirstname(String fName) {
        loginAndCheckoutPage.enterFirstName(fName);
    }

    @And("^then Enter the lastname (.+)$")
    public void thenEnterTheLastname(String lName) {
        loginAndCheckoutPage.enterLastName(lName);
    }

    @And("^then User Enter Postal Code (.+)$")
    public void thenUserEnterPostalCode(String pCode) {
        loginAndCheckoutPage.enterPostalCode(pCode);
    }

    @Then("^Click on the Continue button$")
    public void clickOnTheContinueButton() {
        loginAndCheckoutPage.clickContinueButton();
    }

    @And("^Click on the Finish button$")
    public void clickOnTheFinishButton() {
        loginAndCheckoutPage.clickFinishButton();
    }

    @Then("^Verify the Order completion with header and text message$")
    public void verifyTheOrderCompletion() {
        loginAndCheckoutPage.verifyOrderCompletionMsg();
    }

}
