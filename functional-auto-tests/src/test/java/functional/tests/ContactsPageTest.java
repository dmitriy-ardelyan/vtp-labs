package functional.tests;

import com.vtp.test.DockerWebTestFireFox;
import com.vtp.test.Verify;
import org.testng.annotations.Test;
import vtp.web.steps.ContactsPageSteps;
import vtp.web.steps.LandingPageSteps;

public class ContactsPageTest extends DockerWebTestFireFox {

    @Test
    public void presentDaysTest(){
        LandingPageSteps.visitContactsPage();
        String actualTitle = ContactsPageSteps.getTitle();
        //TODO move expected result to data provider class
        Verify.equals(actualTitle,"КОНТАКТЫ","Verify history page title");
    }
}
