package org.example.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CartTest extends BaseTest {


    @Test
    public void addItemToCart() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        Assert.assertEquals("Pearl Necklace was added to your shopping cart.", cartPage.getSuccessMessageAddToCart());

    }

    @Test
    public void getGrandTotalPrice() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        cartPage.getGrandTotalPrice();
    }

    @Test
    public void updateCartItemQuantity() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        cartPage.setQuantityField(5);
        cartPage.clickUpdateButton();

    }

    @Test
    public void emptyCart() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        cartPage.clickOnEmptyCartButton();
        Assert.assertEquals("SHOPPING CART IS EMPTY", cartPage.setEmptyCartMessageText());
    }

    @Test
    public void deleteFirstItemFromCart() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        homePage.searchForAProduct("RETRO CHIC EYEGLASSES");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("RETRO CHIC EYEGLASSES");
        cartPage.setDeleteFirstItemButton();
    }

    @Test
    public void checkTotalPriceCalculated() {
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        homePage.searchForAProduct("RETRO CHIC EYEGLASSES");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("RETRO CHIC EYEGLASSES");

        Assert.assertEquals("427.58",cartPage.checkIfGrandPriceIsCalculated());
    }

    @Test
    public void goToCheckoutPage(){
        homePage.searchForAProduct("PEARL NECKLACE");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("PEARL NECKLACE");
        homePage.searchForAProduct("RETRO CHIC EYEGLASSES");
        homePage.clickOnSearchIcon();
        searchResultsPage.addProductToCart("RETRO CHIC EYEGLASSES");
        cartPage.clickOnProceedToCheckoutButton();
    }


}