package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    public void addOneItemToCart() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.findElement(By.id("search")).sendKeys("earrings");
        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper >" +
                " div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > button > span > span")).click();
        String successMessage = driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout >" +
                " div > div > div.cart.display-single-price > ul > li > ul > li > span")).getText();

        if (successMessage.equalsIgnoreCase("Swing Time Earrings was added to your shopping cart.")) {
            System.out.println("Add item to cart was a success!!! :)");
        } else {
            System.out.println("Something happened! :( Please try again! ");
        }

        driver.close();
    }

    public void addTwoItemsToCart() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("search")).sendKeys("dress");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper >" +
                " div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > a")).click();
        driver.findElement(By.id("option27")).click();
        driver.findElement(By.id("option73")).click();
        driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
        driver.findElement(By.id("search")).sendKeys("necklace");
        driver.findElement(By.cssSelector("[type = 'submit']")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper " +
                "> div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > button > span > span")).click();
        driver.close();


    }
}
