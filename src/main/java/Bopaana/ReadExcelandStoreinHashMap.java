package Bopaana;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExcelandStoreinHashMap {

    public static Map<String , String > getTestData() throws IOException{

        Map<String , String> testdata= new HashMap<>();
        try {
            FileInputStream inputStream = new FileInputStream("src/main/java/Bopaana/TestData.xlsx");
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int lastRowNumber = sheet.getLastRowNum();

            for(int i=1;i<=lastRowNumber;i++){
                Row row = sheet.getRow(i);
                Cell keyCell = row.getCell(0);
                String key = keyCell.getStringCellValue().trim();

                Cell valueCell = row.getCell(1);
                String value = valueCell.getStringCellValue().trim();

                testdata.put(key,value);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return testdata;
    }
}
