package d13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C03 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("No such element ", Keys.ENTER);

    }
}
