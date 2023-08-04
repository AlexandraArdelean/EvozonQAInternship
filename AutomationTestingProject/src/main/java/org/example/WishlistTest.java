package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistTest extends BaseTest {
    @Test
    public void addItemToWishlist() {
        driver.findElement(By.cssSelector(".account-cart-wrapper .skip-account")).click();
        driver.findElement(By.cssSelector("[title = 'Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.id("search")).sendKeys("earrings");
        driver.findElement(By.cssSelector(" [title='Search']")).click();
        driver.findElements(By.cssSelector(".link-wishlist")).get(2).click();
        String successMessage = driver.findElement(By.cssSelector(".success-msg")).getText();
        Assert.assertEquals("Pearl Stud Earrings has been added to your wishlist. Click here to continue shopping.", successMessage);

    }
}
