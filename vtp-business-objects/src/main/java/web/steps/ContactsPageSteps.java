package web.steps;

import com.vtp.test.pages.Pages;
import web.pages.ContactsPage;

public class ContactsPageSteps {

    public static String getTitle(){
        ContactsPage contactsPage = Pages.get(ContactsPage.class);
        return contactsPage.getPageTitle();
    }
}
