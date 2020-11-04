package vtp.web.steps;

import com.vtp.test.pages.Pages;
import vtp.web.pages.LandingPage;

public class LandingPageSteps {

    public static void visitHistoryPage() {
        LandingPage landingPage = Pages.get(LandingPage.class);
        landingPage
                .openAboutUsMenu()
                .selectHistoryOption();
    }

    public static void visitPresentDaysPage() {
        LandingPage landingPage = Pages.get(LandingPage.class);
        landingPage
                .openAboutUsMenu()
                .selectPresentDaysOption();
    }

    public static void visitContactsPage() {
        LandingPage landingPage = Pages.get(LandingPage.class);
        landingPage
                .openAboutUsMenu()
                .selectContactsOption();
    }

    public static void goToLecturersSchedule() {
        LandingPage landingPage = Pages.get(LandingPage.class);
        landingPage
                .openLearningProcessMenu()
                .openScheduleMenu()
                .openLecturersSchedulePage();
    }
}
