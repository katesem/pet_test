package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//contains xpath-s of web elements located only on Home page

public class BomondHomePage {

    @FindBy(xpath = "//div[@class = 'product-slider'][./*/div[@class = 'title']]")
    WebElement bestsellersProductPanel;
}
