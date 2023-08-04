package org.example.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(css = ".link-wishlist")
    private List<WebElement> wishlistButtons;

    @FindBy(css = "li.item")
    private List<WebElement> webElementList;

    @FindBy(css = ".success-msg span")
    private WebElement addToCartSuccessMessage;


    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToWishlist() {
        wishlistButtons.get(2).click();
    }

    public boolean isProductInList(String product) {
        Assert.assertNotNull(webElementList);
        for (WebElement element : webElementList) {
            if (element.findElement(By.cssSelector(".product-name")).getText().equalsIgnoreCase(product)) {
                return true;
            }

        }
        return false;
    }


    public boolean isSortByPriceAscending() {
//        System.out.println(webElementList.size());
        double firstPrice = getPriceFromProduct(webElementList.get(0));
        double lastPrice = getPriceFromProduct(webElementList.get(webElementList.size() - 1));
        if (firstPrice <= lastPrice) {
            return true;
        }
        return false;
    }

    public boolean addProductToCart(String productName) {
        Assert.assertNotNull(webElementList);
        for (WebElement element : webElementList) {
            if (element.findElement(By.cssSelector(".product-name")).getText().equalsIgnoreCase(productName)) {
                element.findElement(By.cssSelector(".btn-cart")).click();
                return true;
            }
        }
        return false;
    }

    public String getSuccessMessageAddToCart(){
        return addToCartSuccessMessage.getText();
    }


    private double getPriceFromProduct(WebElement webElement) {
//        System.out.println(webElement.getText());
//        System.out.println(webElement.findElement(By.cssSelector(".price")).
//                getText());
        return Double.parseDouble(webElement.findElement(By.cssSelector(".price")).
                getText().substring(1));


    }


}
