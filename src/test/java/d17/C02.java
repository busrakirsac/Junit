package d17;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02 {

    @Test
    public void test01() throws IOException {


        //Örnek 1: Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
        FileInputStream fis = new FileInputStream("src/test/java/resources/Capitals.xlsx");
        Workbook workbook= WorkbookFactory.create(fis);
        Cell cell = workbook.getSheet("Sheet1").getRow(0).getCell(1);
        System.out.println("cell = " + cell);


        //Örnek 2: 3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
        String actualCell = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
        String expectedCell ="France";
        Assert.assertEquals(expectedCell,actualCell);


        //Örnek 3: Kullanılan satır sayısın bulun
        int icindeDataBulunanSatirSayisi = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
        System.out.println("icindeDataBulunanSatirSayisi = " + icindeDataBulunanSatirSayisi);


        //Örnek 4: Sayfadaki son satırin index ini yazdırınız
        System.out.println(workbook.getSheet("Sheet1").getLastRowNum());


        //Örnek 5: Excel sayfasindaki datalari COUNTRY,CAPITALS (Ülke-Başkent) key-value şeklinde console a yazdiriniz

        Map<String,String> ulkeBaskentleri = new HashMap<>();

        for (int i = 0; i <workbook.getSheet("Sheet1").getPhysicalNumberOfRows() ; i++) {

            String country = workbook.getSheet("Sheet1").getRow(i).getCell(0).toString();
            String capital = workbook.getSheet("Sheet1").getRow(i).getCell(1).toString();

            ulkeBaskentleri.put(country,capital);
        }
        System.out.println("ulkeBaskentleri = " + ulkeBaskentleri);


    }
}
