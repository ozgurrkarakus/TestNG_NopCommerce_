package TC_502;

import TC_501.RandomEmail;
import TC_501.TC_501_502_Elements;
import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_502 extends BaseDriver {
    @Test

    public void Login() {
        TC_501_502_Elements element = new TC_501_502_Elements();
        driver.get("https://demo.nopcommerce.com/");
        element.login.click();
//String randomEmail = RandomEmail.generateRandomEmail();

        element.loginEmail.sendKeys("ozgurkarakus.fb@gmail.com");
        element.loginPassword.sendKeys("Admin123");
        element.loginButton.click();

        Assert.assertEquals(element.logOut.getText(), "Log out","Error");


    }
}
