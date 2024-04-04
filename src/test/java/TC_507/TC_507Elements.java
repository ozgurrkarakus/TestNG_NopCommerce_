package TC_507;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_507Elements {

    public TC_507Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[text()='Computers ']")
    public WebElement computerTab;


    @FindBy(xpath = "//a[text()='Desktops ']")
    public WebElement deskTop;

    @FindBy(xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
    public WebElement buildPc;
    @FindBy(xpath = "//*[@name=\"product_attribute_2\"]")
    public WebElement ramOptiobs;


    @FindBy(xpath = "//*[@id=\"product_attribute_input_3\"]//label")
    public List<WebElement> hddOptions;

    @FindBy(xpath = "(//*[@id=\"product_attribute_3_6\"])")
    public WebElement gb320;

    @FindBy(xpath = "(//*[@id=\"product_attribute_3_7\"])")
    public WebElement gb400;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addtocart;

    @FindBy(xpath = "(//*[text()='Shopping cart'])[1]")
    public WebElement shoppingcart;

    @FindBy(xpath = "//*[@id=\"shopping-cart-form\"]")
    public WebElement cart;




}
