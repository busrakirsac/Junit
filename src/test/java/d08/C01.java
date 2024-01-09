package d08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01 extends TestBase {


    @Test
    public void test01() {
        driver.get("https://the-internet.herokuapp.com/iframe");


        //Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
        String text = driver.findElement(By.tagName("h3")).getText();
        Assert.assertTrue(text.contains("Editor"));

        //Textbox içindeki yazıyı siliniz.
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();

        //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        textBox.sendKeys("Bu textbox iFrame içinde yer almaktadır");

        //Sayfadaki "Elemental Selenium" yazısının olduğunu doğrulayınız.
        driver.switchTo().defaultContent();
        WebElement elementalSelenium = driver.findElement(By.xpath("//*[.='Elemental Selenium']"));
        Assert.assertEquals("Elemental Selenium",elementalSelenium.getText());


    }
}
