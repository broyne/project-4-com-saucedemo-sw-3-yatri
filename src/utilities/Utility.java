package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //This method will Send text to Element

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
}
