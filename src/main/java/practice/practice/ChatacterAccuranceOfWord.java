package practice.practice;

import java.util.HashMap;
import java.util.Map;

public class ChatacterAccuranceOfWord {

    public static void main(String[] args) {

        String str = "Welcome to great india great because india is great  ".trim();

       String [] ar =  str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String words:ar
             ) {
            if(map.containsKey(words)){
                map.put(words, map.get(words)+1);
            }else {
                map.put(words, 1);
            }
        }

        for (String x : map.keySet()
             ) {
            System.out.println("Word accurance :" +x + " = "+ map.get(x));
        }

    }
}
