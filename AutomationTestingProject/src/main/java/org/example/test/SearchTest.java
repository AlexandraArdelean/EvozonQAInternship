package org.example.test;

import org.example.utils.Constants;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void checkIfSearchedProductIsAvailable(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        accountPage.writeTextInSearchBar("neck");
        accountPage.clickOnSearch();
        searchResultsPage.isProductInList("PEARL NECKLACE");

    }


    @Test
    public void checkIfProductsAreSortAscending(){
        accountPage.writeTextInSearchBar("neck");
        accountPage.clickOnSearch();
        searchResultsPage.isSortByPriceAscending();
    }



}
