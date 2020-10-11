package com.vtp.test;

import com.vtp.test.pages.Pages;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerWebTestFireFox {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void startWebTest() throws MalformedURLException {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setVersion("");

        String hubUrl = "http://192.168.0.105:4444/wd/hub";

        driver = new RemoteWebDriver(new URL(hubUrl), capabilities);
        Pages.init(driver);
        //TODO Implement property supplier class and read properties
        driver.manage().window().maximize();
        driver.get("https://web.kpi.kharkov.ua/otp/ru/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
