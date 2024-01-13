package d14;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02 extends TestBase {

    @Test
    public void test01() throws IOException {

        //amazon sayfasina gidiniz
        driver.get("https://amazon.com");
        driver.navigate().refresh();
        driver.navigate().refresh();

        //Sayfanin ekran gorunutusunu aliniz
        String dosyaYolu ="src/test/java/screenShots/amazon.png";
        TakesScreenshot ts = (TakesScreenshot) driver;

        Files.write(Paths.get(dosyaYolu),   ts.getScreenshotAs(OutputType.BYTES) );

    }


    @Test
    public void test02() {

        //youtube sayfasina gidiniz
        driver.get("https://youtube.com");

        //Sayfanin ekran gorunutusunu aliniz
        String dosyaYolu="src/test/java/screenShots/youtube.jpeg";
        TakesScreenshot ts = (TakesScreenshot) driver;

        try {
            Files.write(Paths.get(dosyaYolu), ts.getScreenshotAs(OutputType.BYTES) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void test03() throws IOException {

        //facebook sayfasina gidiniz
        driver.get("https://facebook.com");

        //sayfanin ekran goruntusunu aliniz
        String dosyaYolu="src/test/java/screenShots/facebook.png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu), ts.getScreenshotAs(OutputType.BYTES));

    }


    @Test
    public void test04() throws IOException {

        //facebook sayfasina gidiniz
        driver.get("https://facebook.com");

        //sayfanin ekran goruntusunu aliniz

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );

        String dosyaYolu="src/test/java/screenShots/ "+date+"facebook.png";

        TakesScreenshot ts = (TakesScreenshot) driver;
        Files.write(Paths.get(dosyaYolu), ts.getScreenshotAs(OutputType.BYTES));



    }
}
