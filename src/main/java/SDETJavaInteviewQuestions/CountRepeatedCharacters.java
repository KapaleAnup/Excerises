package SDETJavaInteviewQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountRepeatedCharacters {


    public static void main(String[] args) {

        String sentence = "I am going to learn java programing to get better java".replaceAll("\\s+ ","");
        char[] array = sentence.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (Character c: array
             ) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }


        for (Character x:map.keySet()
             ) {
            System.out.println("character accourance: "+ x + " = " + map.get(x));
        }

    }
}
