package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {
    // checkout on unregistered user fields
    @FindBy(css = "#onepage-guest-register-button")
    private WebElement continueAsGuestButton;
    @FindBy(css = "[name='billing[firstname]']")
    private WebElement firstNameField;
    @FindBy(css = "[name='billing[middlename]']")
    private WebElement middleNAmeField;
    @FindBy(css = "[name='billing[lastname]']")
    private WebElement lastNameField;
    @FindBy(css = "[name='billing[email]']")
    private WebElement emailAddressField;
    @FindBy(css = "[name= 'billing[street][]']")
    private WebElement streetAddressField;
    @FindBy(css = "[name='billing[city]']")
    private WebElement cityField;
    @FindBy(css = "[name='billing[region_id]']")
    private WebElement stateDropDown;
    @FindBy(css = "[name='billing[postcode]']")
    private WebElement postalCodeField;
    @FindBy(css = "[name='billing[country_id]']")
    private WebElement countryDropDown;
    @FindBy(css = "[name='billing[telephone]']")
    private WebElement telephoneField;
    @FindBy(css = "#billing-buttons-container [title='Continue']")
    private WebElement continueFromBilling;

    @FindBy(css = "h1")
    private WebElement errorMessage504;

    // checkout on registered user fields
    @FindBy(css = ".form-list > li:nth-of-type(4) > label")
    private WebElement differentAddressRadioButton;
    @FindBy(css = "[for='shipping\\:same_as_billing']")
    private WebElement useBillingAddressButton;

    @FindBy(css = "#shipping-buttons-container [title='Continue']")
    private WebElement continueFromShippingInfo;

    @FindBy(css = "#shipping-method-buttons-container [type='button']")
    private WebElement continueBtnFromShippingMethod;
    @FindBy(css = "#payment-buttons-container [type ='button']")
    private WebElement continueBtnPayment;

    @FindBy(css = "#review-buttons-container [title='Place Order']")
    private WebElement placeOrderBtn;

    @FindBy(css = ".col-main > p:nth-of-type(2)")
    private WebElement orderConfirmationMessage;

    // Constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // checkout on unregistered user methods
    public void clickOnContinueAsGuestButton() {
        continueAsGuestButton.click();
    }

    public void setFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void setMiddleNAmeField(String middleNAme) {
        middleNAmeField.sendKeys(middleNAme);
    }

    public void setLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setEmailAddressField(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
    }

    public void setStreetAddressField(String streetAddress) {
        streetAddressField.sendKeys(streetAddress);
    }

    public void setCityField(String cityName) {
        cityField.sendKeys(cityName);
    }

    public void selectCountryFromDropDown(String country) {
        Select countries = new Select(driver.findElement(By.cssSelector("[name='billing[country_id]']")));
        countries.selectByVisibleText(country);

    }

    public void selectStateFromDropDown(String state) {
        Select states = new Select(driver.findElement(By.cssSelector("[name='billing[region_id]']")));
        states.selectByVisibleText(state);
    }

    public void setPostalCodeField(String postalCode) {
        postalCodeField.sendKeys(postalCode);
    }

    public void setTelephoneField(String telephone) {
        telephoneField.sendKeys(telephone);
    }

    public void clickContinueFromBilling() {
        continueFromBilling.click();

    }

    public String check504ErrorMessage() {
//        withTimeoutOf(Duration.ofSeconds(90))
//                .waitFor(ExpectedConditions.elementToBeClickable(inDesktopDrop));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Wait up to 10 seconds

        By elementLocator = By.cssSelector("h1"); // Replace with your element's locator
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        System.out.println(element.getText());
        return element.getText();
    }

    // checkout on registered user methods
    public void selectDifferentShippingAddress() {
        differentAddressRadioButton.click();
    }

    public void selectUseBillingAddress() {
        useBillingAddressButton.click();
    }

    public void clickContinueFromShippingInfo() {
        continueFromShippingInfo.click();
    }

    public void clickContinueBtnFromShippingMethod() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#shipping-method-buttons-container [type='button']"))).click();

    }

    public void clickContinueBtnPayment() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#payment-buttons-container [type ='button']"))).click();
        //continueBtnPayment.click();
    }

    public void clickPlaceOrderBtn() {

        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#review-buttons-container [title='Place Order']"))).click();
        //placeOrderBtn.click();
    }

    public String getConfimOrderMessage() {
        return orderConfirmationMessage.getText();
    }


}
