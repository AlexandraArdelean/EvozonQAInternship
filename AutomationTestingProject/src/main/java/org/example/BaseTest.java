package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class BaseTest {
    public WebDriver driver=new ChromeDriver() ;


    @Before
    public void openHomepage() {
        System.setProperty("webdriver.chrome.driver", "AutomationTestingProject/resources/chromedriver.exe");
        driver.get("http://qa2magento.dev.evozon.com/");
        driver.manage().window().maximize();
    }

    @After
    public void closeHomepage() {
        driver.quit();
    }


}
