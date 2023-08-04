package org.example.test;

import org.example.utils.Constants;
import org.junit.Assert;
import org.junit.Test;



public class LoginTest extends BaseTest {
    @Test
    public void loginWithValidCredentials() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, " + Constants.USER_NAME + "!", accountPage.getWelcomeTextLogin());

    }

}
