package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBase {
    
     protected WebDriver driver;

    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

  //  @After
  //  public void tearDown() throws Exception {
  //      driver.quit();
  //  }



    //Select Visible Text DropDown
    public void selectVisible(WebElement ddm, String option){
        Select select = new Select(ddm);
        select.selectByVisibleText(option);
    }

    //Select index DropDown
    public void selectIndex(WebElement ddm, int index){
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //Hard Wait
    public void bekle(int second)  {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Window Handles
    public void window(int index){
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }

    //iframe index
    public void frameIndex(int index){
        driver.switchTo().frame(index);
    }


    //screenshot
    public void screenShot(){
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );
        String dosyaYolu="src/test/java/screenShots/"+date+"screenShot.png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        try {
            Files.write(Paths.get(dosyaYolu), ts.getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //webelement screenshot
    public void screenShotOfWebElement(WebElement webElement){

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format( LocalDateTime.now() );

        String dosyaYolu="src/test/java/screenShots/"+date+"webElementSS.png";

        try {
            Files.write(  Paths.get(dosyaYolu) , webElement.getScreenshotAs(OutputType.BYTES) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //JS Executor Click Method
    public void jsClick(WebElement webElement){

        try {
            webElement.click();
        } catch (Exception e) {
            JavascriptExecutor js= (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",webElement);
        }
    }

    //JS Executor Scroll Webelement Method
    public void jsScroll(WebElement webelement){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", webelement);
    }

    //JS Executor Scroll End
    public void jsScrollToEnd(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }


    //JS Executor Scroll Home
    public void jsScrollToHome(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }


    //JS Executor SendKeys
    public void jsSendKeys(WebElement webElement,String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='"+value+"'",webElement);
    }


    public void rapor(String browser, String reportName){

        extentReports = new ExtentReports();

        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path = "target/extentReport/" + date + "htmlReport.html";
        extentHtmlReporter = new ExtentHtmlReporter(path);

        extentReports.attachReporter(extentHtmlReporter);

        extentHtmlReporter.config().setDocumentTitle("X");

        extentHtmlReporter.config().setReportName(reportName);

        extentReports.setSystemInfo("Enviroment", "QA");
        extentReports.setSystemInfo("Browser", browser);
        extentReports.setSystemInfo("Test Automation Engineer", "Ayse");
    }

}
