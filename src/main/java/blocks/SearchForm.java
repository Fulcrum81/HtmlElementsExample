package blocks;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Select;
import ru.yandex.qatools.htmlelements.element.TextInput;

/**
 * Created by vadimzubovich on 4/6/2016.
 */
@Name("Search form")
@FindBy(id = "portal-menu__search__form")
public class SearchForm extends HtmlElement {

    @Name("Search field")
    @FindBy(css = ".pm-toolbar__search__input")
    TextInput searchField;

    @Name("Parameters switch")
    @FindBy(css = ".pm-toolbar__search__params__text")
    Select parametersSwitch;

    @Name("Search button")
    @FindBy(css = ".js-submit-button")
    Button searchButton;

    public void search(String searchText) {
        searchField.sendKeys(searchText);
        searchButton.click();
    }

}