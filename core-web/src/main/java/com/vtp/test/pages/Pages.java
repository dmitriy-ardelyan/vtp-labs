package com.vtp.test.pages;

import org.openqa.selenium.WebDriver;

public class Pages extends PageObject {

    private static ThreadLocal<ThreadPages> threadLocal = new ThreadLocal<ThreadPages>();

    public static <T extends PageObject> T get(Class<?> clazz) {
        ThreadPages threadPages = threadLocal.get();
        return threadPages.get(clazz);
    }

    public static void init(WebDriver driver) {
        threadLocal.set(new ThreadPages(driver));
    }
}
