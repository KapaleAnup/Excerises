package automationTalk;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.util.HashMap;

public class ExcelOperations {


    String filePath= "src/main/automationTalk/Data.xlsx";

    public HashMap<String, String> getTestDataMap(int rowNum) throws  Exception{

        File file = new File(filePath);
       Workbook workbook = WorkbookFactory.create(file);

       // get the sheetname
      Sheet sheeName =  workbook.getSheet("InputData");

      //Assign a map to get a data in Key , value pair
        HashMap<String , String> map = new HashMap<>();

        // iterate the i with 0 so that it will get the keys(Header of columns)
        // sheeName.getRow(0).getLastCellNum()   --> it will help to get the last column
        for (int i = 0; i<sheeName.getRow(0).getLastCellNum();i++){

            //convert the values to string format even thouth the values provided are in another data type.
            sheeName.getRow(rowNum).getCell(i).setCellType(CellType.STRING);

            map.put(sheeName.getRow(0).getCell(i).toString(), sheeName.getRow(rowNum).getCell(i).toString());
        }


        return map;
    }


    public static void main(String[] args) throws Exception {

        ExcelOperations excelOperations = new ExcelOperations();
        System.out.println(excelOperations.getTestDataMap(2));

    }
}
