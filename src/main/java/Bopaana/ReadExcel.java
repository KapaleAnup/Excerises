package Bopaana;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class ReadExcel {


    @Test
    public void getExcelMapData(){

        try {
            Map<String , String > testdata = ReadExcelandStoreinHashMap.getTestData();

            for (Map.Entry<String, String> map :testdata.entrySet()
                 ) {
                System.out.println("Key = "+ map.getKey() + " "+ "Value = "+ map.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
