package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{
    @FindBy(css = ".page-title")
    private WebElement logoutMessageText;
    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public String getLogoutMessage() {
        return logoutMessageText.getText();
    }
}
