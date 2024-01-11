package d12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03 extends TestBase {

    @Test
    public void uploadTest() {

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        WebElement choosFile=driver.findElement(By.id("file-upload"));

        //Yuklemek istediginiz dosyayi secelim.
        String userHome = System.getProperty("user.home");
        String herkesteAyniOlanYol="/Downloads/b10 all test cases, code.docx";
        String dynamicPath =userHome+herkesteAyniOlanYol;

        choosFile.sendKeys(dynamicPath);

        bekle(2);


        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();


        //“File Uploaded!” textinin goruntulendigini test edelim.

        String actualText = driver.findElement(By.xpath("//h3")).getText();
        String expectedText="File Uploaded!";
        Assert.assertEquals(expectedText,actualText);

    }

}
