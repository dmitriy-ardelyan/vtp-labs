package com.vtp.test.pages;

import com.vtp.test.LoggerSupplier;
import com.vtp.test.Verify;
import com.vtp.test.annotations.PageIdentifier;
import com.vtp.test.driver.Waits;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Field;
import java.util.List;

public abstract class PageObject {

    protected WebDriver driver;
    protected Waits wait;

    protected void waitReady() {
        LoggerSupplier.getLogger().info("Waiting for {} to be fully loaded", this.getClass().getSimpleName());
        Verify.isTrue(wait.isElementDisplayed(getPageIdentifier()), String.format("%s is loaded", this.getClass().getSimpleName()));
    }

    private WebElement getPageIdentifier() {
        List<Field> fieldsWithAnnotation = FieldUtils.getFieldsListWithAnnotation(this.getClass(), PageIdentifier.class);
        if (fieldsWithAnnotation.isEmpty()) {
            //TODO implement custom exception handling
            throw new RuntimeException("Could not find page identifier");
        }
        Field annotatedField = fieldsWithAnnotation.get(0);
        annotatedField.setAccessible(true);

        try {
            if (WebElement.class.isAssignableFrom(annotatedField.getType())) {
                return (WebElement) annotatedField.get(this);
            } else {
                //TODO create custom Runtime Exception class
                throw new RuntimeException("@Pageidentifier has to be set on WebElement only");
            }
        } catch (IllegalAccessException e) {
            //TODO create custom Runtime Exception class
            throw new RuntimeException(e.getMessage());
        }
    }
}
