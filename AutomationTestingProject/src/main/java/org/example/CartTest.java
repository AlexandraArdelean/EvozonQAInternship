package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class CartTest extends BaseTest {

    @Test
    public void addOneItemToCart() {
        openHomepage();
        driver.findElement(By.id("search")).sendKeys("earrings");
        driver.findElement(By.cssSelector(".input-box [title='Search']")).click();
        driver.findElements(By.cssSelector(".category-products .products-grid li .actions button")).get(0).click();
        String successMessage = driver.findElement(By.cssSelector(".success-msg span")).getText();
        Assert.assertEquals("Swing Time Earrings was added to your shopping cart.", successMessage);


    }

    @Test
    public void addTwoItemsToCart() {
        openHomepage();
        driver.findElement(By.id("search")).sendKeys("dress");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();
        driver.findElements(By.cssSelector("[title= 'View Details']")).get(2).click();
        driver.findElement(By.id("option27")).click();
        driver.findElement(By.id("option73")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        String message = driver.findElement(By.cssSelector(".success-msg span")).getText();
        if (message.equalsIgnoreCase("Lafayette Convertible Dress was added to your shopping cart.")) {
            driver.findElement(By.id("search")).sendKeys("necklace");
            driver.findElement(By.cssSelector("[type = 'submit']")).click();
            driver.findElements(By.cssSelector(".actions [title ='Add to Cart']")).get(0).click();
            String message2 = driver.findElement(By.cssSelector(".success-msg")).getText();
            Assert.assertEquals("Pearl Necklace was added to your shopping cart.", message2);

        }
    }
}