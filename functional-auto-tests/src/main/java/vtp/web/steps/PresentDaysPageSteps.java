package vtp.web.steps;

import com.vtp.test.pages.Pages;
import vtp.web.pages.PresentDaysPage;

public class PresentDaysPageSteps {

    public static String getTitle(){
        PresentDaysPage presentDaysPage = Pages.get(PresentDaysPage.class);
        return presentDaysPage.getPageTitle();
    }
}
