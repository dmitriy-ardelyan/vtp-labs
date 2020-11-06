package web.steps;

import com.vtp.test.pages.Pages;
import web.pages.HistoryPage;

public class HistoryPageSteps {

    public static String getTitle(){
        HistoryPage historyPage = Pages.get(HistoryPage.class);
        return historyPage.getPageTitle();
    }
}
