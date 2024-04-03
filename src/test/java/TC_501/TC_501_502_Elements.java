package TC_501;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_501_502_Elements {
    public TC_501_502_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    //a[text()='Register']
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@name='Gender']")
    public WebElement radio;
    @FindBy(xpath = "//input[@name='FirstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement lastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    public WebElement dateOfBirthDay;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    public WebElement dateOfBirthMonth;

  // @FindBy(xpath = "//select[@name='DateOfBirthMonth']/option[@value='3']")
    //public WebElement march;

    //select[@name='DateOfBirthMonth']/option[@value='3']
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    public WebElement dateOfBirthYear;
    @FindBy(xpath = "//input[@name='Email']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='Company']")
    public WebElement company;
    @FindBy(xpath = "//input[@name='Password']")
    public WebElement password;
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//button[@name='register-button']")
    public WebElement registerButton;
    @FindBy(xpath = "(//*[contains(@class, 'result')])[3]")
    public WebElement assertMessage ;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement login;
    @FindBy(xpath = "//input[@name='Email']")
    public WebElement loginEmail;
    @FindBy(xpath = "//input[@name='Password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='My account']")
    public WebElement assertMyAccount;
    @FindBy(xpath = "//a[text()='Log out']")
    public WebElement logOut;



}
