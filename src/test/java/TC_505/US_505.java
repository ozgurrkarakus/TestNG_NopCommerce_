package TC_505;

import Utility.BaseDriver;
import io.cucumber.java.bs.A;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_505 extends BaseDriver {
    @Test
    @Parameters("searchText")
    public void Test(String searchID) {
        TC_505_elements elements = new TC_505_elements();

        driver.get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        actions.moveToElement(elements.computerTab).build().perform();
        elements.noteBooks.click();

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        for (WebElement e : elements.noteBooksAll) {

            if (searchID.equals(e.getText())) {
                System.out.println("TEST PASSED" + "\n" + e.getText());
            }
        }
        elements.searcButton.click();
        elements.searcButton.sendKeys(searchID + Keys.ENTER);

        elements.pageText.getText();

        Assert.assertTrue(elements.pageText.getText().contains(searchID));

    }
}
