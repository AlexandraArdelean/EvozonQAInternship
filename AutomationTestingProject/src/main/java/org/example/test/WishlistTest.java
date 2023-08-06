package org.example.test;

import org.example.utils.Constants;
import org.junit.Assert;
import org.junit.Test;


public class WishlistTest extends BaseTest {
    @Test
    public void addItemToWishlist() {

        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        accountPage.writeTextInSearchBar("earrings");
        accountPage.clickOnSearch();
        searchResultsPage.addProductToWishlist();
        Assert.assertEquals("Pearl Stud Earrings has been added to your wishlist. " +
                "Click here to continue shopping.", wishlistpage.getSuccessMsgWishlist());

    }
}
