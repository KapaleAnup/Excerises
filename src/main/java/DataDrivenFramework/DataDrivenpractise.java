package DataDrivenFramework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class DataDrivenpractise {

    public static void  main(String[] args)throws FileNotFoundException, IOException {


        FileInputStream inputStream = new FileInputStream("Users/anupkapale/Documents/Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);


       int CountofSheets=  workbook.getNumberOfSheets();

        for(int i=0; i<CountofSheets;i++) {

            if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
                XSSFSheet sheet = workbook.getSheetAt(i);  //RETURN TYPE IS XSSFSheet

                Iterator<Row> rows =  sheet.iterator();
               Row firstRow= rows.next();
              Iterator<Cell> ce = firstRow.cellIterator();
              ce.next();

              while (ce.hasNext()){
                  Cell vaule = ce.next();

                  if( vaule.getStringCellValue().equalsIgnoreCase("Data2")){


                  }
              }
            }
        }
    }
}
