package JSONFileRead;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    @Test
    public void ReadJsonData(){

            JSONParser parser = new JSONParser();


            try {
                Object obj = parser.parse(new FileReader("/Users/anupkapale/eclipse-workspace/Excersises/src/main/java/JSONFileRead/Data.json"));

                JSONObject jsonObject = (JSONObject) obj;
                String name = (String) jsonObject.get("Name");
                String author = (String) jsonObject.get("Author");
                System.out.println(name);
                System.out.println(author);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }


        }
    }

