package d19;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01 extends TestBase {

    @Test
    public void test01() {

        //amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //aramakutusunun style özelliklerini degistirelim
        WebElement searcBox = driver.findElement(By.id("twotabsearchtextbox"));
        searcBox.sendKeys("selenium");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='5px solid red'",searcBox);


        //arkaplan rengi yesil
        js.executeScript("arguments[0].style.backgroundColor='green'",searcBox);

        //metin rengi beyaz
        js.executeScript("arguments[0].style.color='white'",searcBox);



        //sayfanin ekran görüntüsünü alalim
        screenShot();


    }
}
