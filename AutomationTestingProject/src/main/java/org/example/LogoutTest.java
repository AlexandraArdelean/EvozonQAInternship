package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogoutTest extends BaseTest {
    @Test
    public void logout() {
        driver.findElement(By.cssSelector(".account-cart-wrapper .skip-account")).click();
        driver.findElement(By.cssSelector("[title = 'Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("[title = 'Log Out']")).click();
        String logOutMessage = driver.findElement(By.cssSelector(".page-title")).getText();
        Assert.assertEquals("YOU ARE NOW LOGGED OUT", logOutMessage);

    }
}
