package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void registerWithValidCredentials() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Alexa");
        driver.findElement(By.id("middlename")).sendKeys("Ioana");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("email_address")).sendKeys("alexaioana@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmation")).sendKeys("123456");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
        String confirmationMessage = driver.findElement(By.cssSelector("body > div > div > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li > span")).getText();
        if (confirmationMessage.equalsIgnoreCase("Thank you for registering with Madison Island.")) {
            System.out.println("Registration was successful!! Good job!");
        } else {
            System.out.println("Unable to register. Please try again!");
        }

        driver.close();


    }
}
