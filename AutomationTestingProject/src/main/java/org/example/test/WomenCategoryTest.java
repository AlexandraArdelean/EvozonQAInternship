package org.example.test;


import org.example.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenCategoryTest extends BaseTest {
    @Test
    public void performHoverOverWomenCategory() {
        WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(hoverElement).build().perform();
    }

    @Test
    public void sortItemsBySize() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector("#nav .nav-1")).click();
        driver.findElement(By.cssSelector(".catblocks [alt='New Arrivals']")).click();
        driver.findElements(By.cssSelector("#narrow-by-list .odd li")).get(0).click();
        WebElement webElement = driver.findElement(By.id("product-collection-image-909"));
        js.executeScript("arguments[0].scrollIntoView();", webElement); //scroll down the page
        Assert.assertTrue("Element not found!", webElement.isDisplayed());

    }
}
