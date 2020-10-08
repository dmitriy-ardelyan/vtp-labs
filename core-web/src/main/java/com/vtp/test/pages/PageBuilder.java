package com.vtp.test.pages;

import com.vtp.test.driver.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBuilder {
    protected WebDriver driver;
    protected Waits wait;

    public <T extends PageObject> T build(Class clazz) {
        T page = initPageAndResources(clazz);
        PageFactory.initElements(driver, clazz);
        return page;
    }

    protected <T extends PageObject> T initPageAndResources(Class<?> clazz) {

        try {
            T page = (T) clazz.newInstance();
            page.driver = driver;
            page.wait = wait;
            return page;
        } catch (Exception e) {
            //TODO Add proper exception handling.
            throw new RuntimeException("Could not init page" + clazz);
        }
    }

    public PageBuilder setDriver(WebDriver driver) {
        this.driver = driver;
        return this;
    }

    public PageBuilder setWait(Waits wait) {
        this.wait = wait;
        return this;
    }
}
