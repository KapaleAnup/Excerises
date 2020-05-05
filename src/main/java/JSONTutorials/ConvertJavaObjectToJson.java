package JSONTutorials;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertJavaObjectToJson {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        Person person = newPerson();
        try {
            mapper.writeValue(new File("person.json"),person);
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
            System.out.println(jsonString);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    private static Person newPerson(){

        Person person = new Person();

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Cricket");
        hobbies.add("Football");
        hobbies.add("Painting");

        List<String> mobile = new ArrayList<>();
        mobile.add("8767510435");
        mobile.add("1234567890");

        Map<String, String> langauges = new HashMap<>();
        langauges.put("French", "Beginner");
        langauges.put("German", "Intermediate");
        langauges.put("Spanish", "Advanced");

        person.setName("Anup");
        person.setAge(30);
        person.setHobbies(hobbies);
        person.setMobile(mobile);
        person.setLangauges(langauges);
        return person;
    }
}
