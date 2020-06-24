package Collections.HashMapTutorials;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapIterate {


    public static void main(String[] args) {

        Map<String,String> fruits = new HashMap<>();

        fruits.put("banana","vitaminA");
        fruits.put("apple","vitaminC");
        fruits.put("cocunt","vitamninA");


        Set keys = fruits.keySet();
       // fruits.
        System.out.println("All keys are: " + keys);
// To get all key: value
        for(Object key: keys){
            System.out.println(key + ": " + fruits.containsValue("apple"));
        }


        for (Map.Entry allfruits:fruits.entrySet()
             ) {
            System.out.println(allfruits);
        }


    }
}
