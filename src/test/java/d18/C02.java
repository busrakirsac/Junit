package d18;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02 extends TestBase {

    @Test
    public void scrollwithJS() {

        //https://testpages.herokuapp.com/ adresine gidiniz
        driver.get("https://testpages.herokuapp.com/");

        //Challenges a kadar scroll yapiniz
        WebElement challengesWebElement =driver.findElement(By.xpath("//h2[.='Challenges']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",challengesWebElement);


    }

    @Test
    public void test01() {
        //amazona gidelim
        driver.get("https://amazon.com");

        //jsexecutor ile arama kutusuna selenium yazdiralim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='selenium'",searchBox);
        searchBox.submit();
    }

    @Test
    public void test02() {
        //amazona gidelim
        driver.get("https://amazon.com");

        //jsexecutor ile arama kutusuna selenium yazdiralim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        jsSendKeys(searchBox,"selenium");
    }

    @Test
    public void setAttribute() {

        //amazon sayfasina gidelim
        driver.get("https://amazon.com");


        //arama kutus id attribute degerini ismimiz ile degistirelim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('id','mehmet')",searchBox);

        //degistirmis oldugumuz id ile arama kutusunu locate ederek java aratalim
        driver.findElement(By.id("mehmet")).sendKeys("java");

    }





}
