package TC_506;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_506 extends BaseDriver {

    @Test
    public void US_5061() {
        US_506_Elements myelement = new US_506_Elements(); // driver'ı constructor üzerinden geçirin
        driver.get("https://demo.nopcommerce.com/");
        String tabMenuGift = myelement.TabMenuGift.getText();
        Assert.assertEquals(tabMenuGift, "Gift Cards", "Tab menu does not match the expected value.");
    }

    @Test// Dikkat: dataProvider ismi doğru olmalıdır.
    public void US_5062() {
        US_506_Elements myelement = new US_506_Elements(); // driver'ı constructor üzerinden geçirin
        driver.get("https://demo.nopcommerce.com/");

        myelement.giftButton.click();
        myelement.ClikGiftCard.click();
        myelement.recipientSubmit.click();
        Assert.assertEquals(myelement.deneme.getText(), "Enter valid recipient name\n" +
                "Enter valid recipient email\n" +
                "Enter valid sender name\n" +
                "Enter valid sender email", "Error message does not match the expected value.");
    }

    @Test
    @Parameters({"Name", "Email", "yName", "yMail", "Message"}) // Parametrelerin adları doğru
    public void US_5063(String name, String email, String yName, String yMail, String message) {
        US_506_Elements myelement = new US_506_Elements(); // driver'ı constructor üzerinden geçirin
        driver.get("https://demo.nopcommerce.com/");
        myelement.giftButton.click();
        myelement.ClikGiftCard.click();

        // Eksik olan random fiziksel hediye seçim kısmı için kod ekleme
        // Random bir seçim yapmak için ekstra bir metot gerekebilir

        myelement.recipientName.sendKeys(name);
        myelement.recipientMail.sendKeys(email);
        myelement.recipientSenderName.sendKeys(yName);
        myelement.recipientSenderMail.sendKeys(yMail);
        myelement.recipientMessage.sendKeys(message);
        myelement.recipientSubmit.click();
        // Sepete eklenip eklenmediğini kontrol etmek için ekstra doğrulama ekleme
        Assert.assertEquals(myelement.doneNotification.getText(),"The product has been added to your shopping cart","Error");
    }
}
