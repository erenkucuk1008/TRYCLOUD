package com.trycloud.tests;

import com.trycloud.page.FilesPage;
import com.trycloud.page.MainMenuPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US3 extends TestBase {

    //As a user, I should be able to access to Files Module.
    public FilesPage filesPage = new FilesPage();

    @Test//Verify file title's page
    public void TC1_verifyUsersCanAccessToFileModule(){
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Files"));
    }

    @Test//verify all files are selected
    public void TC2_verifyUsersCanSelectAllUploadedFilesFromThePage(){
        filesPage.checkBoxAllSelect.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(filesPage.checkBoxAllSelect.isDisplayed());
    }

    @Test
    public void TC3_verifyUsersCanAddAFileToFavorites(){
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//a[@class='action action-menu permanent']"));
        list.get(2).click();
        filesPage.buttonAddToFavorites.click();
        WebElement text = Driver.getDriver().findElement(By.xpath("//span[.='Arithmatic Operators']"));
        String actualText = text.getText();
        String expectedText = "Arithmatic Operators";
        filesPage.buttonFavorites.click();
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void TC5_verifyUsersCanUploadAFile(){
        FilesPage.addIconOnFilePage();
        WebElement uploadFile = filesPage.uploadFile;
        uploadFile.sendKeys("C:\\Users\\erenk\\Downloads\\TryCloud.pdf.pdf");
        WebElement uploadedFile = Driver.getDriver().findElement(By.xpath("//span[.='TryCloud.pdf']"));
        Assert.assertTrue(uploadedFile.isDisplayed());
    }




    @Test
    public void TC6_verifyUsersCanCreateAFolder(){
        FilesPage.addIconOnFilePage();
        filesPage.newFolder.click();
    }
















    /*
        MainMenuPage.mainMenuToFiles();
        FilesPage.addIconOnFilePage();
        //addIconOnFilePage();
        filesPage.writeFolderName.sendKeys("ErenK"+ Keys.ENTER);
        WebElement folderName = Driver.getDriver().findElement(By.xpath("//span[.='ErenK']"));
        String actualName = folderName.getText();
        Assert.assertTrue(actualName.contains("ErenK"));
     */

     /*
    @Test
    public void TC4_verifyUsersCanRemoveAFileFromFavorites() throws InterruptedException {
        BrowserUtils.sleep(2);
        filesPage.buttonFavorites.click();
        BrowserUtils.sleep(2);
        filesPage.threeDot.click();
        BrowserUtils.sleep(2);
        filesPage.buttonRemoveFromFavorites.click();
    }
     */

}
