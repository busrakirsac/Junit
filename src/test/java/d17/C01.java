package d17;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01 {

    @Test
    public void test01() throws IOException {

        String path ="src/test/java/resources/Capitals.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet =workbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);

        Cell cell =row.getCell(0);

        System.out.println("cell = " + cell);


    }

    @Test
    public void test02() throws IOException {

        String path ="src/test/java/resources/Capitals.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fis);

        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));

    }
}
