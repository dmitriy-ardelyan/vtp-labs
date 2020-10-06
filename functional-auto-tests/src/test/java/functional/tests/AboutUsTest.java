package functional.tests;

import com.vtp.test.WebTest;
import com.vtp.test.pages.Pages;
import org.testng.annotations.Test;
import vtp.web.pages.LandingPage;

public class AboutUsTest extends WebTest {

    @Test
    public void aboutUsMenuTest(){
        LandingPage landingPage = Pages.get(LandingPage.class);
    }
}
