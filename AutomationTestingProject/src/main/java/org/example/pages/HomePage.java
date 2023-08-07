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

    @FindBy(id = "search")
    private WebElement searchBar;

    @FindBy(css = ".input-box [title='Search']")
    private WebElement magnifyingGlassIcon;


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

    public void searchForAProduct(String productName){
        searchBar.sendKeys(productName);
    }

    public void clickOnSearchIcon(){
        magnifyingGlassIcon.click();
    }

}
