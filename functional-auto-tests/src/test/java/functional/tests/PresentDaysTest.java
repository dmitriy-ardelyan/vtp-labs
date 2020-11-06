package functional.tests;

import com.vtp.test.Verify;
import com.vtp.test.WebTest;
import org.testng.annotations.Test;
import web.steps.LandingPageSteps;
import web.steps.PresentDaysPageSteps;

public class PresentDaysTest extends WebTest {

    @Test
    public void presentDaysTest(){
        LandingPageSteps.visitPresentDaysPage();
        String actualTitle = PresentDaysPageSteps.getTitle();
        //TODO move expected result to data provider class
        Verify.equals(actualTitle,"КАФЕДРА В НАШИ ДНИ","Verify history page title");
    }
}
