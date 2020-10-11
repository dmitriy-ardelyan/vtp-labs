package functional.tests;

import com.vtp.test.Verify;
import com.vtp.test.WebTest;
import org.testng.annotations.Test;
import vtp.web.steps.ContactsPageSteps;
import vtp.web.steps.LandingPageSteps;
import vtp.web.steps.PresentDaysPageSteps;

public class ContactsPageTest extends WebTest {

    @Test
    public void presentDaysTest(){
        LandingPageSteps.visitContactsPage();
        String actualTitle = ContactsPageSteps.getTitle();
        //TODO move expected result to data provider class
        Verify.equals(actualTitle,"КОНТАКТЫ","Verify history page title");
    }
}
