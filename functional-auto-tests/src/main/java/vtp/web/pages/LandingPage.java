package vtp.web.pages;

import com.vtp.test.annotations.PageIdentifier;
import com.vtp.test.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageObject {

    @PageIdentifier
    @FindBy(linkText = "О нас")
    private WebElement location;

}
