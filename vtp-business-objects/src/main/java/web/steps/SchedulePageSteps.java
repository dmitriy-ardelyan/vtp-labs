package web.steps;

import com.vtp.test.pages.Pages;
import web.pages.SchedulePage;

public class SchedulePageSteps {

    public static boolean isLecturerPresent(String partialName) {
        SchedulePage schedulePage = Pages.get(SchedulePage.class);
        return schedulePage.isLecturerPresent(partialName);
    }
}
