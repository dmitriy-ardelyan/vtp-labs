package com.vtp.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private WebDriverWait wait;
    private int timeoutInSec;

    public Waits(WebDriver driver, int timeoutInSec) {
        this.timeoutInSec = timeoutInSec;
        wait = new WebDriverWait(driver, timeoutInSec);
    }

    public WebElement elementToBeDisplayed(WebElement webElement) {
        wait.until((WebDriver wd) -> webElement.isDisplayed());
        return webElement;
    }

    public boolean isElementDisplayed(WebElement webElement) {
        return wait.until((WebDriver wd) -> webElement.isDisplayed());
    }

    public void waitReady(int delay){
        //TODO update this to be wait element is displayed by BY locator
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
