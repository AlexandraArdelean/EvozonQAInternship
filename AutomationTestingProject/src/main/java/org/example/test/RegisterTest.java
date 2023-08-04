package org.example.test;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.example.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Locale;

public class RegisterTest extends BaseTest {

    @Test
    public void registerWithValidCredentials() {
        Faker faker = new Faker();
        String pass = faker.internet().password();

        homePage.clickAccountLink();
        homePage.clickRegisterLink();
        registerPage.enterFirstName(faker.name().firstName());
        registerPage.enterMiddleName(faker.name().firstName());
        registerPage.enterLastName(faker.name().lastName());
        registerPage.enterEmailAddress(faker.internet().emailAddress());
        registerPage.enterPassword(pass);
        registerPage.setConfirmPassField(pass);
        registerPage.clickRegisterButton();
        Assert.assertEquals("Thank you for registering with Madison Island.", accountPage.getWelcomeTextRegister());
    }

}
