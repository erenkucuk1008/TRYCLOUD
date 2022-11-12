package com.trycloud.tests.base;

import com.trycloud.page.FilesPage;
import com.trycloud.page.LoginPage;
import com.trycloud.page.MainMenuPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    @BeforeClass
    public void loginTryCloud(){
        LoginPage loginPage = new LoginPage();
        String tryCloudURL = ConfigurationReader.getProperty("tryCloudURL");
        Driver.getDriver().get(tryCloudURL);
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }

    @BeforeMethod
    public static void mainMenuToFiles(){
        MainMenuPage mainMenuPage = new MainMenuPage();
        mainMenuPage.buttonFiles.click();
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
