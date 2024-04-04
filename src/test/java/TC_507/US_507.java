package TC_507;

import TC_505.TC_505_elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class US_507 extends BaseDriver {
    @Test

    public void Test() {
        TC_507Elements elements = new TC_507Elements();

        driver.get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(driver);

            Tools.Bekle(2);
        actions.moveToElement(elements.computerTab).build().perform();
        elements.deskTop.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));

        wait.until(ExpectedConditions.urlContains("desktops"));
        js.executeScript("arguments[0].scrollIntoView(true);", elements.buildPc);
        elements.buildPc.click();

        Select ramRandom=new Select(elements.ramOptiobs);

        int randomNum = (int)(Math.random() * 3) + 1;
        ramRandom.selectByIndex(randomNum);



        int HDDrandomNum = (int)(Math.random() * 2) + 1;
        if (HDDrandomNum==1){
            elements.gb320.click();
        }else elements.gb400.click();

        js.executeScript("arguments[0].scrollIntoView(true);", elements.addtocart);

        elements.addtocart.click();

        elements.shoppingcart.click();

        Assert.assertTrue(elements.cart.isDisplayed());




//        int hddNum=(int)(Math.random() * 2) + 1;
//        hddrandom.selectByIndex(hddNum);
//        System.out.println("elements = " + elements.hddOptions.getText());

//        int hddrandomNum = (int)(Math.random() * 3) + 1;
//        if (hddrandomNum==1){
//            hddrandom.selectByVisibleText("320 GB");
//        }else hddrandom.selectByVisibleText("400 GB [+$100.00]");







        Tools.Bekle(2);

//



    }
}