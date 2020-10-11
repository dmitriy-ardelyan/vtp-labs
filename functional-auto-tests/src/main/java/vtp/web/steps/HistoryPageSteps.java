package vtp.web.steps;

import com.vtp.test.pages.Pages;
import vtp.web.pages.HistoryPage;
import vtp.web.pages.LandingPage;

public class HistoryPageSteps {

    public static String getTitle(){
        HistoryPage historyPage = Pages.get(HistoryPage.class);
        return historyPage.getPageTitle();
    }
}
