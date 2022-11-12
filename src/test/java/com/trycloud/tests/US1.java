package com.trycloud.tests;

import com.trycloud.page.LoginPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US1 extends TestBase {

    // User Story:
    // As a user, I should be able to login

    // http://qa2.trycloud.net/index.php/login?clear=1
    //username: User1
    //password: Userpass123

    @Test
    public void TC1_verifyLogin(){
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @Test//Switch credentials in configuration.properties first and then test it !!!!
    public void TC2_loginWithInvalidCredentials(){
        LoginPage loginPage = new LoginPage();
        String warningText = loginPage.wrongUsernameOrPasswordText.getText();
        String expectedText = "Wrong username or password.";
        Assert.assertTrue(warningText.contains(expectedText));

        String expectedTitle = "Trycloud";
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);

    }
}
