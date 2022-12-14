package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="user")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="submit-form")
    public WebElement loginButton;

    @FindBy(id="lost-password")
    public WebElement forgotPassword;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongUsernameOrPasswordText;


}
