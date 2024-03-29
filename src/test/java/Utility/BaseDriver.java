package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri()  // TearStart
    {
        //System.out.println("Baslangic İşlemleri Yapılıyor"); // driver oluşturma,wait işlemleri
        driver=new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet : sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet : elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }

    public void LoginTest(){
        System.out.println("Login Test Başladı");
        driver.get("https://demo.nopcommerce.com/");
        Tools.Bekle(2);
        WebElement loginClick= driver.findElement(By.xpath("//a[text()='Log in']"));
        loginClick.click();

        WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("ozgurkarakus.fb@gmail.com");

        WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        password.sendKeys("Admin123");


        WebElement loginBtn=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginBtn.click();

    }
    @AfterClass
    public void KapanisIslemleri() // TearDown
    {
        System.out.println("Kapanış İşlemleri Yapılıyor"); // BekleKapat
        Tools.Bekle(3);
        driver.quit();

    }



}

