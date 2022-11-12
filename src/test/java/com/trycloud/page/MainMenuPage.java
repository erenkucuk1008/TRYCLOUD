package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage {

    public MainMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[1]")
    public WebElement buttonDashboard;
    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement buttonFiles;
    @FindBy(xpath = "//ul[@id='appmenu']/li[3]")
    public WebElement buttonPhotos;
    @FindBy(xpath = "//ul[@id='appmenu']/li[4]")
    public WebElement buttonActivity;
    @FindBy(xpath = "//ul[@id='appmenu']/li[5]")
    public WebElement buttonTalk;
    @FindBy(xpath = "//ul[@id='appmenu']/li[6]")
    public WebElement buttonContacts;
    @FindBy(xpath = "//ul[@id='appmenu']/li[7]")
    public WebElement buttonCircles;
    @FindBy(xpath = "//ul[@id='appmenu']/li[8]")
    public WebElement buttonCalender;
    @FindBy(xpath = "//ul[@id='appmenu']/li[9]")
    public WebElement buttonDeck;




}
