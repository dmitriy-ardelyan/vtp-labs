package com.vtp.test;

import com.vtp.test.pages.Pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void startWebTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Pages.init(driver);
        //TODO Implement propert supplier class and read properties
        driver.get("https://web.kpi.kharkov.ua/otp/ru/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
