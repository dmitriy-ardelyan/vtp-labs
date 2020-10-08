package com.vtp.test.pages;

import com.vtp.test.driver.Waits;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadPages {
    private Map<Class<?>, PageObject> pageInstances;
    private PageBuilder pageBuilder;

    ThreadPages(WebDriver driver) {
        pageInstances = new ConcurrentHashMap<Class<?>, PageObject>();
        //TODO move this magic number to a property file
        Waits wait = new Waits(driver, 30);
        pageBuilder = new PageBuilder().setDriver(driver).setWait(wait);

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
