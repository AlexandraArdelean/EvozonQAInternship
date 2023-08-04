package org.example.pages;

import org.example.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".account-cart-wrapper .skip-account")
    private WebElement accountLink;
    @FindBy(css = "[title = 'Log In']")
    private WebElement loginLink;

    @FindBy(css = "[title = 'Register']")
    private WebElement registerLink;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomepage() {
        driver.get(Constants.BASE_URL);
    }

    public void clickAccountLink() {
        accountLink.click();
    }

    public void clickRegisterLink() {
        registerLink.click();

    }

    public void clickLoginLink() {
        loginLink.click();
    }


}
