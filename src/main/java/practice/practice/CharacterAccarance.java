package practice.practice;

import java.util.HashMap;
import java.util.Map;

public class CharacterAccarance {

    public static void main(String[] args) {

        String str = "Welcome to india".replaceAll("\\s+","");

        char[] strarray = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (Character count:strarray
             ) {
          if(map.containsKey(count)){
              map.put(count, map.get(count)+1);

          }else {
              map.put(count, 1);
          }
        }

        for (Character finalCount :map.keySet()
             ) {
            System.out.println("Character Accurance : " + finalCount + " = " + map.get(finalCount));
        }


    }
}
