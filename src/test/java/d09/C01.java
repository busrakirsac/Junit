package d09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C01 extends TestBase {

    @Test
    public void test01() {

        //Window 1'de https://www.amazon.com adresine gidiniz
        driver.get("https://www.amazon.com");
        String amazonWindowHandleDegeri = driver.getWindowHandle();

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandleDegeri = driver.getWindowHandle();


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandleDegeri = driver.getWindowHandle();


        bekle(2);
        //amazon sayfasına geçiniz:
        driver.switchTo().window(amazonWindowHandleDegeri);
        bekle(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandleDegeri);
        bekle(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandleDegeri);
        bekle(2);


    }

    @Test
    public void test02() {

        //Window 1'de https://www.amazon.com adresine gidiniz
        driver.get("https://www.amazon.com");
        String amazonWindowHandleDegeri = driver.getWindowHandle();


        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        String youtubeWindowHandleDegeri = driver.getWindowHandle();


        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandleDegeri = driver.getWindowHandle();


        bekle(2);
        //amazon sayfasına geçiniz:
        driver.switchTo().window(amazonWindowHandleDegeri);
        bekle(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(youtubeWindowHandleDegeri);
        bekle(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(linkedinWindowHandleDegeri);
        bekle(2);

    }

    @Test
    public void test03() {

        //Window 1'de https://www.amazon.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");


        List<String> windows = new ArrayList<>( driver.getWindowHandles() );


        //amazon sayfasına geçiniz:
        driver.switchTo().window(windows.get(0));
        bekle(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(windows.get(1));
        bekle(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(windows.get(2));
    }

    @Test
    public void test04() {

        //Window 1'de https://www.amazon.com adresine gidiniz
        driver.get("https://www.techproeducation.com");


        //Window 2'de (yeni bir pencerede) https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");

        //Window 3'te (yeni bir pencerede) https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");


        //amazon sayfasına geçiniz:
        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        bekle(2);

        //youtube sayfasına geçiniz:
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        bekle(2);

        //linkedIn sayfasına geçiniz:
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    }
}
