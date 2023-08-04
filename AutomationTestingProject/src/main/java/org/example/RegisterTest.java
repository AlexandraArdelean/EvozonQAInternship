package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends BaseTest {
    @Test
    public void registerWithValidCredentials() {
        driver.findElement(By.cssSelector(".account-cart-wrapper .skip-account")).click();
        driver.findElement(By.cssSelector("[title = 'Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("Alexa");
        driver.findElement(By.id("middlename")).sendKeys("Ioana");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("email_address")).sendKeys("alexioanaa@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector(".buttons-set [title = 'Register']")).click();
        String confirmationMessage = driver.findElement(By.cssSelector(".success-msg span")).getText();
        Assert.assertEquals("Thank you for registering with Madison Island.",confirmationMessage);
    }
}
