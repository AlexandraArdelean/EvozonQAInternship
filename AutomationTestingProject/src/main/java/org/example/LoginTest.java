package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;



public class LoginTest extends BaseTest {
    @Test
    public void loginWithValidCredentials() {
        driver.findElement(By.cssSelector(".account-cart-wrapper .skip-account")).click();
        driver.findElement(By.cssSelector("[title = 'Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        String welcomeText = driver.findElement(By.cssSelector(".hello strong")).getText();
        Assert.assertEquals("Hello, Alexandra R Pop!", welcomeText);

    }

}
