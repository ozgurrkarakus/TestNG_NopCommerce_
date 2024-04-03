package TC_501;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import Utility.Tools;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_501 extends BaseDriver {
    @Test
    public void register() {
        TC_501_502_Elements element = new TC_501_502_Elements();

        driver.get("https://demo.nopcommerce.com/");

        element.register.click();
        element.radio.click();
        element.firstName.sendKeys("Ozgur");
        element.lastName.sendKeys("Karakus");

        element.dateOfBirthDay.click();
        Select day = new Select(element.dateOfBirthDay);
        day.selectByIndex(4);

        element.dateOfBirthMonth.click();
        Select month = new Select(element.dateOfBirthMonth);
        month.selectByIndex(4);


        element.dateOfBirthYear.click();
        Select year = new Select(element.dateOfBirthYear);
        year.selectByIndex(5);
        element.dateOfBirthYear.click();

        String randomEmail = RandomEmail.generateRandomEmail();
        element.email.sendKeys(randomEmail);


        element.company.sendKeys("TechnoStudy");
        element.password.sendKeys("Bug123");
        element.confirmPassword.sendKeys("Bug123");
        element.registerButton.click();
        Tools.Bekle(2);
        System.out.println("Random Email: " + randomEmail+"\nPassword= Admin123");

        Assert.assertTrue(element.assertMessage.getText().equals("Your registration completed"),"Not Found");
    }

}
