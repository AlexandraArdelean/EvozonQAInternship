package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WomenCategoryTest {
    public void performHoverOverCategory() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.manage().window().maximize();
        WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(hoverElement).build().perform();
        driver.close();
    }

    public void sortItemsBySize() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div > div.main-container.col1-layout > div > div.col-main > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.cssSelector("#narrow-by-list > dd:nth-child(1) > ol > li:nth-child(1) > a")).click();
        WebElement webElement = driver.findElement(By.id("product-collection-image-909"));
        if (webElement.isDisplayed())
            System.out.println("Sort by size works!");
        else
            System.out.println("Something went wrong! :(");
        driver.close();


    }
}
