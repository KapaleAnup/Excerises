package JSONTutorials;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJson {


    public static void main(String[] args) throws IOException, ParseException {

        //Use jsonparse to parse the jsonojects

        JSONParser jsonParser = new JSONParser();

        // load file

        FileReader reader = new FileReader("src/main/resources/employee.json");

        //Create object to read the file
       Object obj = jsonParser.parse(reader);

       //Create jsonObject to read the values from JSON file.
       JSONObject empobject= (JSONObject)obj;

        String firstname = (String) empobject.get("firstName");
        String lastname = (String) empobject.get("lastName");

        System.out.println("FistName is : " + firstname);
        System.out.println("LastName is : " + lastname);

        //extract json array

      JSONArray array =  (JSONArray) empobject.get("address");

      for(int i =0;i<array.size();i++){

          JSONObject address=   (JSONObject)array.get(i);

         String street = (String) address.get("Street");
          String city = (String) address.get("city");
          String state = (String) address.get("State");


          System.out.println("Addres of "+ i + " is" );
          System.out.println("Street : " + street);
          System.out.println("City : " + city);
          System.out.println("State : " + state );
      }
    }


}
