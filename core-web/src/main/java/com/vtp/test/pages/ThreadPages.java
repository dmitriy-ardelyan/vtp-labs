package com.vtp.test.pages;

import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadPages {
    private Map<Class<?>, PageObject> pageInstances;
    private PageBuilder pageBuilder;

    ThreadPages(WebDriver driver) {
        pageInstances = new ConcurrentHashMap<Class<?>, PageObject>();
        pageBuilder = new PageBuilder().setDriver(driver);
    }

    public <T extends PageObject> T get(Class<?> clazz) {
        if (pageInstances.containsKey(clazz)) {
            return (T) pageInstances.get(clazz);
        }
        PageObject page = pageBuilder.build(clazz);
        pageInstances.put(clazz, page);
        return (T) page;
    }
}
