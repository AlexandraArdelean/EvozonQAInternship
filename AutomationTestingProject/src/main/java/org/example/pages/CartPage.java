package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(css = ".product-cart-price .price")
    private List<WebElement> itemsPriceList;

    @FindBy(css = "tfoot > tr > td:nth-of-type(2)  .price")
    private WebElement cartGrandTotal;

    @FindBy(css = "#shopping-cart-totals-table > tbody > tr:nth-child(2) > td:nth-child(2) > span")
    private WebElement taxPrice;

    @FindBy(css = ".success-msg span")
    private WebElement addToCartSuccessMessage;

    @FindBy(css = "input[title = 'Qty']")
    private WebElement quantityField;

    @FindBy(css = ".product-cart-actions [title='Update']")
    private WebElement updateButton;

    @FindBy(id = "empty_cart_button")
    private WebElement emptyCartButton;
    @FindBy(css = ".page-title h1")
    private WebElement emptyCartMessageText;

    @FindBy(css = ".first.odd > .a-center.last.product-cart-remove > a[title='Remove Item']")
    private WebElement deleteFirstItemButton;

    @FindBy(css = ".checkout-types.bottom [title='Proceed to Checkout']")
    private WebElement proceedToCheckoutButton;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public double getGrandTotalPrice() {
        return getPriceFromCartProducts(cartGrandTotal);
    }

    public double getTaxPrice() {
        System.out.println("Tax price: " + getPriceFromCartProducts(taxPrice));
        return getPriceFromCartProducts(taxPrice);
    }

    public double calculateProductPriceCombined() {
        double total = 0.00;
        for (WebElement element : itemsPriceList) {
            total = total + getPriceFromCartProducts(element);

        }
        System.out.println("Sum of prices: " + total);
        return total;
    }
    //TODO
    public boolean checkIfGrandPriceIsCalculated() {
        double grandTotal = calculateProductPriceCombined() + getTaxPrice();
        System.out.println("Grand total: " + grandTotal);

        if (grandTotal == getGrandTotalPrice()) {
            return true;
        }
        return false;
    }


    public String getSuccessMessageAddToCart() {
        return addToCartSuccessMessage.getText();
    }

    public void setQuantityField(int qty) {
        quantityField.clear();
        quantityField.sendKeys(String.valueOf(qty));

    }

    public void clickUpdateButton() {
        updateButton.click();
    }

    public void clickOnEmptyCartButton() {
        emptyCartButton.click();
    }

    public String setEmptyCartMessageText() {
        return emptyCartMessageText.getText();
    }

    public void setDeleteFirstItemButton() {
        deleteFirstItemButton.click();
    }

    public void clickOnProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }


    private double getPriceFromCartProducts(WebElement webElement) {
        return Double.parseDouble(webElement.getText().substring(1));
    }


}
