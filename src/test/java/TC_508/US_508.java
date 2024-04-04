package TC_508;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_508 extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void test(String searchID){
        US_508_elemnts elements=new US_508_elemnts();
        driver.get("https://demo.nopcommerce.com/");

        elements.search.click();
        elements.search.sendKeys(searchID + Keys.ENTER);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", elements.adobe);

        Assert.assertTrue(elements.adobe.isDisplayed());


    }
}
