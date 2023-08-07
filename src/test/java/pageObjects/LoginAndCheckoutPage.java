package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginAndCheckoutPage {

    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cartLink = By.xpath("//a[@class='shopping_cart_link']");
    By checkOut = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueBtn = By.id("continue");
    By finishBtn = By.id("finish");
    By orderConfirmation = By.xpath("//h2[@class='complete-header']");
    By orderText = By.xpath("//div[@class='complete-text']");

    public WebDriver driver;
    public LoginAndCheckoutPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void navigateToSite(){
        driver.get("https://www.saucedemo.com/");
    }

    public void enterUsername(String name){
        driver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginButton(){
        driver.findElement(loginBtn).click();
    }

    public void verifyLogin() {
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {
            System.out.println("Logged in Successfully");
        } else {
            System.out.println("Login Failed. User not redirected to the inventory page.");
        }
    }

    public void clickAddToCart(){
        driver.findElement(addToCart).click();
    }

    public void clickCartButton(){
        driver.findElement(cartLink).click();
    }

    public void clickCheckoutButton(){
        driver.findElement(checkOut).click();
    }

    public void enterFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }

    public void enterPostalCode(String pCode){
        driver.findElement(postalCode).sendKeys(pCode);
    }

    public void clickContinueButton(){
        driver.findElement(continueBtn).click();
    }

    public void clickFinishButton(){
        driver.findElement(finishBtn).click();
    }

    public void verifyOrderCompletionMsg(){
        System.out.println(driver.findElement(orderConfirmation).getText());
        System.out.println(driver.findElement(orderText).getText());
    }
}
