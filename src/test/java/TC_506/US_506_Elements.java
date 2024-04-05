package TC_506;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utility.BaseDriver.driver;

public class US_506_Elements {

    public US_506_Elements() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[7]/a")
    public WebElement TabMenuGift;
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[7]/a")
    public WebElement giftButton;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a")
    public WebElement ClikGiftCard;

    @FindBy(xpath = "//*[@id=\"giftcard_43_RecipientName\"]")
    public WebElement recipientName;

    @FindBy(xpath = "//*[@id=\"giftcard_43_RecipientEmail\"]")
    public WebElement recipientMail;

    @FindBy(xpath = "//*[@id=\"giftcard_43_SenderName\"]")
    public WebElement recipientSenderName;

    @FindBy(xpath = "//*[@id=\"giftcard_43_SenderEmail\"]")
    public WebElement recipientSenderMail;

    @FindBy(xpath = "//*[@id=\"giftcard_43_Message\"]")
    public WebElement recipientMessage;

    @FindBy(xpath = "//*[@id=\"add-to-cart-button-43\"]")
    public WebElement recipientSubmit;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div")
    public WebElement deneme;
    @FindBy (xpath = "//*[@id=\"bar-notification\"]/div/p")
    public WebElement doneNotification;

}
