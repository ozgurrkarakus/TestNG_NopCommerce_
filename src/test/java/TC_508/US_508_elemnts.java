package TC_508;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_508_elemnts extends BaseDriver {

    public US_508_elemnts() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@class=\"search-box-text ui-autocomplete-input\"]")
    public WebElement search;

    @FindBy(xpath = "//*[text()='Adobe Photoshop CS4']")
    public WebElement adobe;
}
