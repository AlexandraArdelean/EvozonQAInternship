package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;



public class AccountTest extends BaseTest {

    @Test
    public void editContactInformation() {
        driver.findElement(By.cssSelector(".account-cart-wrapper .skip-account")).click();
        driver.findElement(By.cssSelector("[title = 'Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".dashboard div:nth-child(3) .col-1 .box-title a")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Alexandra");
        driver.findElement(By.id("middlename")).clear();
        driver.findElement(By.id("middlename")).sendKeys("R");
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("current_password")).sendKeys("123456");
        driver.findElement(By.cssSelector("[title = 'Save']")).click();
        String successMessage = driver.findElement(By.cssSelector(".success-msg")).getText();
        Assert.assertEquals("The account information has been saved.", successMessage);

    }


    @Test
    public void editAccountAddressBook() {
        driver.findElement(By.cssSelector(".account-cart-wrapper .skip-account")).click();
        driver.findElement(By.cssSelector("[title = 'Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".dashboard div:nth-child(4) .col-1 .box-title a")).click();
        driver.findElement(By.id("telephone")).sendKeys("0770789123");
        driver.findElement(By.id("street_1")).sendKeys("Alabala nr.3");
        driver.findElement(By.id("street_2")).sendKeys("Portocala nr. 5");
        driver.findElement(By.id("city")).sendKeys("New York");
        driver.findElement(By.id("region_id")).click();
        driver.findElement(By.cssSelector("#region_id > option:nth-child(44)")).click();
        driver.findElement(By.id("zip")).sendKeys("NY-125800");
        driver.findElement(By.cssSelector("[title = 'Save Address']")).click();

    }
}