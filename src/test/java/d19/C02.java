package d19;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02 extends TestBase {

    @Test
    public void test01() {

        Logger logger = LogManager.getLogger(C02.class);

        //amazon sayfasina gidelim
        driver.get("https://amazon.com");
        logger.info("Amazon web sayfasina gidildi");

        //arama kutusunda selenium aratalim
        WebElement searcBox = driver.findElement(By.id("twotabsearchtextbox"));
        logger.info("arama kutusu locate edildi");

        searcBox.sendKeys("selenium", Keys.ENTER);
        logger.info("arama kutusunda selenium aratildi");

    }
}
