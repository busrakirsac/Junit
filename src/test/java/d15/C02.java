package d15;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C02 extends TestBase {

    ExtentReports extentReports;

    ExtentHtmlReporter extentHtmlReporter;

    ExtentTest extentTest;


    @Test
    public void extentReportTemplate() {



        //bu object i raporlari olusturmak ve yonetmek icin kullanacacğız
        extentReports = new ExtentReports();



        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path = "target/extentReport/" + date + "htmlReport.html";
        extentHtmlReporter = new ExtentHtmlReporter(path);

        //ExtentReports a Html raporlayiciyi ekler, bu raporun html formatinda olusturulmasini saglar
        extentReports.attachReporter(extentHtmlReporter);


        //Html raporunun belge basligini ayarlar, bu baslik sekme uzerinde görünür
        extentHtmlReporter.config().setDocumentTitle("Batch 189 Test Reports");

        extentHtmlReporter.config().setReportName("Smoke Test");

        extentReports.setSystemInfo("Enviroment", "QA");
        extentReports.setSystemInfo("Bowser", "Chrome");
        extentReports.setSystemInfo("Test Automation Engineer", "Ahmet");







    }





}
