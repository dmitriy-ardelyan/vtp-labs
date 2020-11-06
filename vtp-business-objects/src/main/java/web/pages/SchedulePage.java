package web.pages;

import com.vtp.test.annotations.PageIdentifier;
import com.vtp.test.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SchedulePage extends PageObject {

    @PageIdentifier
    @FindBy(xpath = "//h3[contains(text(),'РОЗКЛАД')]")
    private WebElement title;

    @FindBy(css = "div.panel-body li a")
    private List<WebElement> linksList;

    public boolean isLecturerPresent(String name) {
        return linksList
                .stream()
                .map(el -> el.getText())
                .anyMatch(str -> str.contains(name));
    }
}
