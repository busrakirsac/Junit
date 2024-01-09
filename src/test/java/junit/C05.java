package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

    }

    @Test
    public void radioButton() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(4000);

        WebElement kadin = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement erkek = driver.findElement(By.xpath("//input[@value='2']"));

        if(! erkek.isSelected()){
            erkek.click();
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}
