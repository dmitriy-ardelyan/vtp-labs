package web.steps;

import com.vtp.test.pages.Pages;
import web.pages.PresentDaysPage;

public class PresentDaysPageSteps {

    public static String getTitle(){
        PresentDaysPage presentDaysPage = Pages.get(PresentDaysPage.class);
        return presentDaysPage.getPageTitle();
    }
}
