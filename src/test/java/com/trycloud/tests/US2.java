package com.trycloud.tests;

import com.trycloud.page.MainMenuPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US2 extends TestBase {

    //US2 : As a user, I should be access all the main modules of the app

    public MainMenuPage mainMenuPage =  new MainMenuPage();

    @Test
    public void TC1_userAccessMainModules(){

        Assert.assertTrue(mainMenuPage.buttonFiles.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonFiles);
        System.out.println("mainMenuPage.buttonFiles.getText() = " + mainMenuPage.buttonFiles.getText());

        Assert.assertTrue(mainMenuPage.buttonDashboard.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonDashboard);
        System.out.println("mainMenuPage.buttonDashboard.getText() = " + mainMenuPage.buttonDashboard.getText());

        Assert.assertTrue(mainMenuPage.buttonPhotos.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonPhotos);
        System.out.println("mainMenuPage.buttonPhotos.getText() = " + mainMenuPage.buttonPhotos.getText());

        Assert.assertTrue(mainMenuPage.buttonActivity.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonActivity);
        System.out.println("mainMenuPage.buttonActivity.getText() = " + mainMenuPage.buttonActivity.getText());

        Assert.assertTrue(mainMenuPage.buttonTalk.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonTalk);
        System.out.println("mainMenuPage.buttonTalk.getText() = " + mainMenuPage.buttonTalk.getText());

        Assert.assertTrue(mainMenuPage.buttonContacts.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonContacts);
        System.out.println("mainMenuPage.buttonContacts.getText() = " + mainMenuPage.buttonContacts.getText());

        Assert.assertTrue(mainMenuPage.buttonCircles.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonCircles);
        System.out.println("mainMenuPage.buttonCircles.getText() = " + mainMenuPage.buttonCircles.getText());

        Assert.assertTrue(mainMenuPage.buttonCalender.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonCalender);
        System.out.println("mainMenuPage.buttonCalender.getText() = " + mainMenuPage.buttonCalender.getText());

        Assert.assertTrue(mainMenuPage.buttonDeck.isDisplayed());
        BrowserUtils.hoverOver(mainMenuPage.buttonDeck);
        System.out.println("mainMenuPage.buttonDeck.getText() = " + mainMenuPage.buttonDeck.getText());


    }
}
