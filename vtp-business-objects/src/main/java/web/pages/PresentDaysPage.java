package web.pages;

import com.vtp.test.annotations.PageIdentifier;
import com.vtp.test.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PresentDaysPage extends PageObject {

    @PageIdentifier
    @FindBy(css = "h2.post-title")
    private WebElement titleLabel;

    @FindBy(xpath = "(//li[contains(@class,'4119')])[2]")
    private WebElement aboutUseMenu;


    public PresentDaysPage openAboutUsMenu() {
        aboutUseMenu.click();
        return this;
    }

    public String getPageTitle() {
        return titleLabel.getText();
    }
}
