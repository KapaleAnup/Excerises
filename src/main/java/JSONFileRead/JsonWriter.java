package JSONFileRead;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {



    public String getRandomName(){
        String name=  RandomStringUtils.randomAlphabetic(5);
        return name;
    }

    @DataProvider(name = "Data")
    public Object[][] getData(){
        Object[][] data=  {{getRandomName()},{getRandomName()}};
        return data;
    }


    @Test(dataProvider = "Data")
    public void Test(String name) throws IOException {

        JSONObject obj = new JSONObject();
        obj.put("Name", name);
        obj.put("Author", "App Shah");

        JSONArray company = new JSONArray();
        company.add("Compnay: eBay");
        company.add("Compnay: Paypal");
        company.add("Compnay: Google");
        obj.put("Company List", company);

        // try-with-resources statement based on post comment below :)

        FileWriter file = new FileWriter("/Users/anupkapale/eclipse-workspace/Excersises/src/main/java/JSONFileRead/Data.json");

        try {

            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);


        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            file.flush();
            file.close();
        }
    }
}
