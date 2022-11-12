package com.trycloud.page;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[1]")
    public WebElement buttonAllFiles;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[2]")
    public WebElement buttonRecent;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[3]")
    public WebElement buttonFavorites;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[4]")
    public WebElement buttonShares;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[5]")
    public WebElement buttonTags;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[6]")
    public WebElement buttonSharedToCircles;

    @FindBy(xpath = "//div[@id='app-navigation']/ul/li[7]")
    public WebElement buttonDeletedFiles;

    @FindBy(xpath = "//div[@id='app-settings-header']")
    public WebElement buttonSettings;

    @FindBy(xpath = "//table[@id='filestable']/thead/tr/th/label[1]")
    public WebElement checkBoxAllSelect;
/*
    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement ucNokta;

    @FindBy(xpath = "//table//tbody//tr//td//a//span[@class='fileactions']//a//span[@class='icon icon-more']")
    public WebElement threeDot;
 */
    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement buttonAddToFavorites;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement buttonRemoveFromFavorites;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//label[@class='menuitem']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement writeFolderName;

    public static void addIconOnFilePage(){
        FilesPage filesPage = new FilesPage();
        filesPage.addIcon.click();
    }



}
