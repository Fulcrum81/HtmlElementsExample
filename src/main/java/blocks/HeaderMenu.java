package blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

/**
 * Created by vadimzubovich on 4/6/2016.
 */
@Name("Header menu")
@FindBy(id = "portal-menu")
public class HeaderMenu extends HtmlElement {

    @Name("Mail button")
    @FindBy(css = "[href='/messages/inbox/']")
    private Button mailButton;

    @Name("Contacts button")
    @FindBy(css = "[href='/addressbook']")
    private Button contactsButton;

    private SearchForm searchForm;

    public void gotoContacts() {
        contactsButton.click();
    }

    public void gotoMailbox() {
        mailButton.click();
    }

    public void search(String searchText) {
        searchForm.search(searchText);
    }

}
