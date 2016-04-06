package pages;

import blocks.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class MailPage {
    private HeaderMenu headerMenu;

    public MailPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void search(String searchText) {
        headerMenu.search(searchText);
    }

    public void gotoContacts() {
        headerMenu.gotoContacts();
    }
}
