package TestingExcellence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConvertMaptoJson {


    @Test
    public void ListOfPersons(){

        Map<String, String> persons = new HashMap<String, String>();

        persons.put("Name","Anup");
        persons.put("Address","Parel");
        persons.put("Gender","Male");


        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String json = objectMapper.writeValueAsString(persons);
            System.out.println("Json =" + json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
