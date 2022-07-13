package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

//contains xpath-s of common web elements for all site pages

public class BasePage {

    @FindBy(xpath = "//span[contains(@class, 'block-search-toggle')]")
    WebElement searchBar;

    @FindBy(xpath = "//input[@id = 'q' and @type = 'text']")
    WebElement searchInputField;

    @FindBy(xpath = "//input[@id = 'q' and @type = 'text']/following::div[contains(@class, 'closeIcon')]")
    WebElement closeSearchInputFieldButton;

    @FindBy(xpath = "//nav[@class = 'catalog-navigation']")
    WebElement categoriesNavBar;

    @FindBy(xpath = "//nav[@class = 'catalog-navigation']")
    List<WebElement> categoriesList;
}