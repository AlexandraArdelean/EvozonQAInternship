package org.example.test;

import org.example.utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeBillingInformationForUnregisteredUser() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        cartPage.clickOnProceedToCheckoutButton();
        checkoutPage.clickOnContinueAsGuestButton();
        checkoutPage.setFirstNameField("Alexandra");
        checkoutPage.setMiddleNAmeField("Ioana");
        checkoutPage.setLastNameField("Pop");
        checkoutPage.setEmailAddressField("alexandra@gmail.com");
        checkoutPage.setStreetAddressField("Aleea nr1/24");
        checkoutPage.setCityField("Cluj Napoca");
        checkoutPage.selectCountryFromDropDown("Romania");
        checkoutPage.selectStateFromDropDown("Cluj");
        checkoutPage.setPostalCodeField("40006");
        checkoutPage.setTelephoneField("0754111489");
        checkoutPage.clickContinueFromBilling();
        //  Assert.assertTrue(checkoutPage.check504ErrorMessage().equals("504 Gateway Time-out"));

    }

    @Test
    public void orderProducts() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(Constants.USER_EMAIL);
        loginPage.setPasswordField(Constants.USER_PASSWORD);
        loginPage.clickLoginButton();
        accountPage.writeTextInSearchBar("necklace");
        accountPage.clickOnSearch();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        cartPage.clickOnProceedToCheckoutButton();
        checkoutPage.selectDifferentShippingAddress();
        checkoutPage.clickContinueFromBilling();
        checkoutPage.selectUseBillingAddress();
        checkoutPage.clickContinueFromShippingInfo();
        checkoutPage.clickContinueBtnFromShippingMethod();
        checkoutPage.clickContinueBtnPayment();
        checkoutPage.clickPlaceOrderBtn();
     //   Assert.assertEquals("You will receive an order confirmation email with details of your order and a link to track its progress.",checkoutPage.getConfimOrderMessage());





    }
}
