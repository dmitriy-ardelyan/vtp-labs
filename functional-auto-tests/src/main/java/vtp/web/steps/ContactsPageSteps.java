package vtp.web.steps;

import com.vtp.test.pages.Pages;
import vtp.web.pages.ContactsPage;
import vtp.web.pages.HistoryPage;

public class ContactsPageSteps {

    public static String getTitle(){
        ContactsPage contactsPage = Pages.get(ContactsPage.class);
        return contactsPage.getPageTitle();
    }
}
