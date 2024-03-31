package TC_505;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_505_elements {
    public TC_505_elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[text()='Computers ']")
    public WebElement computerTab;


    @FindBy(xpath = "//a[text()='Notebooks ']")
    public WebElement noteBooks;


    @FindBy(xpath = "//h2[@class=\"product-title\"]")
    public List<WebElement> noteBooksAll;


    @FindBy(xpath = "//input[@id=\"small-searchterms\"]")
    public WebElement searcButton;

    @FindBy(xpath = "/html/body")
    public WebElement pageText;
}
