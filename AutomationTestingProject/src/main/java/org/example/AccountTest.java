package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountTest {
    public void editContactInformation() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
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
        if (successMessage.equalsIgnoreCase("The account information has been saved."))
            System.out.println("Changes were made successfully!!");
        else
            System.out.println("Something went really wrong!!! :(");

        driver.close();
    }

}
