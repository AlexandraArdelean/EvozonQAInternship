package org.example.test;


import org.example.utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LogoutTest extends BaseTest {
    //TODO
    @Test
    public void logout() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        accountPage.clickAccountLink();
        accountPage.clickLogoutLink();
        Assert.assertEquals("YOU ARE NOW LOGGED OUT", logoutPage.getLogoutMessage());

    }
}
