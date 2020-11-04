package functional.tests;

import com.vtp.test.Verify;
import com.vtp.test.WebTest;
import org.testng.annotations.Test;
import vtp.web.steps.HistoryPageSteps;
import vtp.web.steps.LandingPageSteps;
import vtp.web.steps.PresentDaysPageSteps;

public class PresentDaysTest extends WebTest {

    @Test
    public void presentDaysTest(){
        LandingPageSteps.visitPresentDaysPage();
        String actualTitle = PresentDaysPageSteps.getTitle();
        //TODO move expected result to data provider class
        Verify.equals(actualTitle,"КАФЕДРА В НАШИ ДНИ","Verify history page title");
    }
}
