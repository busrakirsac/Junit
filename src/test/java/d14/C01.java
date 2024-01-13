package d14;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01 extends TestBase {

    @Test
    public void test01() {

        //amazon websayfasina gidelim
        driver.get("https://amazon.com");

        //arama kutusunda laptop aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        searchBox.submit();

        bekle(2);

        //ana sayfaya dönelim
        driver.navigate().back();
        bekle(2);

        //arama kutusunda desktop aratalim
        WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox2.sendKeys("desktop");
        searchBox2.submit();

    }


    @Test
    public void test05() throws InterruptedException {
        //- ebay sayfasına gidiniz
        driver.get("https://ebay.com");

        //electronics bölümüne tıklayınız
        driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();

        //Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
        //Her sayfanın sayfa başlığını yazdıralım
        List<WebElement> products = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));

        for (int i = 0; i < products.size(); i++) {

            // products = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
            products.get(i).click();
            Thread.sleep(2000);
            System.out.println(i + 1 + ". title: " + driver.getTitle());
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }
    }
}