package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public WebDriverWait wait;


    @BeforeClass
    @Parameters("browserType")
    public void BaslangicIslemleri(String browserType) { // TearStart
        // System.out.println("başlangıç işlemleri yapılıyor"); //driver oluşturma, wait işlemleri,

        switch (browserType.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

       driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Tools.Bekle(2);

    }

    public void LoginTest() {
        System.out.println("Login Test Başladı");
        driver.get("https://demo.nopcommerce.com/");
        Tools.Bekle(2);

        WebElement email= driver.findElement(By.xpath("//*[@id=Email]"));
        email.sendKeys("ozgurkarakus.fb@gmail.com");

        WebElement password= driver.findElement(By.xpath("//*[@id=Password]"));
        password.sendKeys("Admin123");



        WebElement loginBtn=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginBtn.click();
        System.out.println("Login Test bitti");
    }

    @AfterClass
    public void KapanisIslemleri() {  // TearDown
        //System.out.println("kapanış işlemleri yapılıyor"); //BekleKapat

        //logout
        Tools.Bekle(3);
        driver.quit();
    }

}
