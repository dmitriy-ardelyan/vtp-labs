package com.vtp.test.pages;

import org.openqa.selenium.WebDriver;

public class Pages {

    private static ThreadLocal<ThreadPages> threadLocal = new ThreadLocal<ThreadPages>();

    public static <T extends PageObject> T get(Class<?> clazz) {
        T t = getInitializedPageObject(clazz);
        t.waitReady();
        return t;
    }

    public static <T extends PageObject> T getInitializedPageObject(Class<?> clazz) {
        ThreadPages threadPages = threadLocal.get();
        return threadPages.get(clazz);
    }

    public static void init(WebDriver driver) {
        threadLocal.set(new ThreadPages(driver));
    }
}
