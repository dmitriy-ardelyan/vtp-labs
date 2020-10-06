package com.vtp.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBuilder {
    protected WebDriver driver;

    public <T extends PageObject> T build(Class clazz) {
        T page = initPageAndSetDriver(clazz);
        PageFactory.initElements(driver, clazz);
        return page;
    }

    protected <T extends PageObject> T initPageAndSetDriver(Class<?> clazz) {

        try {
            T page = (T) clazz.newInstance();
            page.driver = driver;
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
}
