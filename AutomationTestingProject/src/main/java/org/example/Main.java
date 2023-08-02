package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        LoginTest loginTest = new LoginTest();
      //  loginTest.loginWithValidCredentials();

        RegisterTest registerTest = new RegisterTest();
     //   registerTest.registerWithValidCredentials();

        WishlistTest wishlistTest = new WishlistTest();
     //   wishlistTest.addItemToWishlist();

        CartTest cartTest = new CartTest();
    //    cartTest.addOneItemToCart();
       // cartTest.addTwoItemsToCart();

        AccountTest accountTest = new AccountTest();
      //  accountTest.editContactInformation();
        WomenCategoryTest womenCategoryTest = new WomenCategoryTest();
     //   womenCategoryTest.performHoverOverCategory();
        womenCategoryTest.sortItemsBySize();


    }
}