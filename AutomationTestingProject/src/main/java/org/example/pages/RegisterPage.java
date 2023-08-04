package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(id = "firstname")
    private WebElement firstNameField;
    @FindBy(id = "middlename")
    private WebElement middlenameField;
    @FindBy(id = "lastname")
    private WebElement lastnameField;
    @FindBy(id = "email_address")
    private WebElement emailAddressField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "confirmation")
    private WebElement confirmPassField;
    @FindBy(css = ".buttons-set [title = 'Register']")
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName){
        firstNameField.sendKeys(firstName);
    }

    public void enterMiddleName(String middleName){
        middlenameField.sendKeys(middleName);
    }

    public void enterEmailAddress(String email){
        emailAddressField.sendKeys(email);
    }

    public void enterLastName(String lastname){
        lastnameField.sendKeys(lastname);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void setConfirmPassField(String confirmation){
        confirmPassField.sendKeys(confirmation);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
