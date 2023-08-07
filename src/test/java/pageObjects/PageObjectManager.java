package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {


    public LoginAndCheckoutPage loginAndCheckoutPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginAndCheckoutPage getcheckoutPage()
    {
        loginAndCheckoutPage = new LoginAndCheckoutPage(driver);
        return loginAndCheckoutPage;
    }
}
