package d18;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01 extends TestBase {

    @Test
    public void test01() {

        //amazona git
        driver.get("https://amazon.com");

        bekle(2);

        //sell linkine tikla
        WebElement sell = driver.findElement(By.xpath("//*[.='Sell']"));
        sell.click();

    }

    @Test
    public void test02() {
        //amazona git
        driver.get("https://amazon.com");

        bekle(2);

        //sell linkine tikla
        WebElement sellLinki = driver.findElement(By.xpath("//*[.='Sell']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",sellLinki);
    }



    @Test
    public void test03() {
        //amazona git
        driver.get("https://amazon.com");

        bekle(2);

        //sell linkine tikla
        WebElement sellLinki = driver.findElement(By.xpath("//*[.='Sell']"));
        jsClick(sellLinki);

    }

}
