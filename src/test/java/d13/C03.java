package d13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C03 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("No such element ", Keys.ENTER);

    }

    @Test
    public void test02() {

        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();


        //Hello World! Yazının sitede oldugunu test et
        WebElement helloWorld = driver.findElement(By.xpath("//h4[.='Hello World!']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(helloWorld));
        Assert.assertEquals("Hello World!", helloWorld.getText());
    }


    @Test
    public void test03() {

        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();


        //Hello World! Yazının sitede oldugunu test et

        WebElement helloWorld = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("YANLIS LOCATE")));
        Assert.assertEquals("Hello World!", helloWorld.getText());
    }


}
