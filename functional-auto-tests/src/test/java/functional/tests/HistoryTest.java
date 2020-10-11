package functional.tests;

import com.vtp.test.Verify;
import com.vtp.test.WebTest;
import org.testng.annotations.Test;
import vtp.web.steps.HistoryPageSteps;
import vtp.web.steps.LandingPageSteps;

public class HistoryTest extends WebTest {

    @Test
    public void historyPageTest(){
        LandingPageSteps.visitHistoryPage();
        String actualTitle = HistoryPageSteps.getTitle();
        //TODO move expected result to data provider class
        Verify.equals(actualTitle,"КРАТКАЯ ИСТОРИЯ КАФЕДРЫ","Verify history page title");
    }
}
