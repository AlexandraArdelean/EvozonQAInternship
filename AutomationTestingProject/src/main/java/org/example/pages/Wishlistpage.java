package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlistpage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElement successMsgWishlist;

    public Wishlistpage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMsgWishlidt() {
        return successMsgWishlist.getText();
    }
}
