package com.trycloud.utilities;

import com.trycloud.page.MainMenuPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils{

    public static void sleep(double second){

        second = second * 1000;
        try {
            Thread.sleep((long) second)  ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void hoverOver(WebElement element){

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
}
