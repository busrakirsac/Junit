package d16;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01 extends TestBase {

    @Test
    public void test01() {

        rapor("Chrome","AmazonTesti");

        extentTest = extentReports.createTest("Amazon SearchBox","Test Steps");


        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();
        extentTest.info("Kullanici Amazon ana sayfasina gider");


        //Arama kutusunda selenium aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium", Keys.ENTER);
        extentTest.info("Arama kutusunda selenium yazilarak aratildi");


        //Sayfa basliginin selenium icerdigini doğrulayalim
        Assert.assertTrue(driver.getTitle().contains("selenium"));
        extentTest.pass("Sayfa basliginin selenium icerdigi dogrulandi");

        extentReports.flush();
    }
}
