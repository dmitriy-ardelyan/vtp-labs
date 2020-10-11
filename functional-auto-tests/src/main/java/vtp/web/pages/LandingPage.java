package vtp.web.pages;

import com.vtp.test.annotations.PageIdentifier;
import com.vtp.test.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageObject {

    private static final String HISTORY_XPATH = "//a[text()='История развития']";
    private static final String PRESENT_DAYS_XPATH = "//a[text()='Кафедра сегодня']";
    private static final String CONTACTS_XPATH = "//a[text()='Контакты']";

    @PageIdentifier
    @FindBy(xpath = "(//li[contains(@class,'4119')])[2]")
    private WebElement aboutUseMenu;

    @FindBy(css = "h2.post-title")
    private WebElement titleLabel;

    public LandingPage openAboutUsMenu() {
        aboutUseMenu.click();
        return this;
    }

    public void selectHistoryOption() {
        wait.waitReady(5000);
        driver.findElements(By.xpath(HISTORY_XPATH)).get(1).click();
    }

    public void selectPresentDaysOption() {
        wait.waitReady(5000);
        driver.findElements(By.xpath(PRESENT_DAYS_XPATH)).get(1).click();
    }

    public void selectContactsOption() {
        wait.waitReady(5000);
        driver.findElements(By.xpath(CONTACTS_XPATH)).get(1).click();
    }
}
