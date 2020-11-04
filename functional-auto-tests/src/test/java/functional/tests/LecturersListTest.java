package functional.tests;

import com.vtp.test.Verify;
import com.vtp.test.WebTest;
import org.testng.annotations.Test;
import vtp.web.steps.ContactsPageSteps;
import vtp.web.steps.LandingPageSteps;
import vtp.web.steps.SchedulePageSteps;

public class LecturersListTest extends WebTest {

    @Test
    public void presentDaysTest() {
        LandingPageSteps.goToLecturersSchedule();
        String lecturerName = "Бречко";
        boolean isLecturerPresent = SchedulePageSteps.isLecturerPresent(lecturerName);
        Verify.isTrue(isLecturerPresent, String.format("Verify lecturer %s is present on a schedule desk", lecturerName));
    }
}
