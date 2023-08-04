package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    @FindBy(css = ".hello strong")
    private WebElement welcomeTextLoginParagraph;

    @FindBy(css = ".success-msg span")
    private WebElement welcomeTextRegisterParagraph;

    @FindBy(css = ".skip-account")
    private WebElement accountLink;

    @FindBy(css = "a[title='Log Out']")
    private WebElement logoutLink;

    @FindBy(id = "search")
    private WebElement searchBar;
    @FindBy(css = "[title='Search']")
    private WebElement magnifyingGlassButton;



    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeTextLogin() {
        return welcomeTextLoginParagraph.getText();
    }

    public String getWelcomeTextRegister() {
        return welcomeTextRegisterParagraph.getText();
    }

    public void clickAccountLink() {
        accountLink.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public void writeTextInSearchBar(String product){
        searchBar.sendKeys(product);
    }

    public void clickOnSearch(){
        magnifyingGlassButton.click();
    }



}
