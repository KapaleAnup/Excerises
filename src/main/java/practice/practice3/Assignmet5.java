package practice.practice3;

import java.util.HashMap;
import java.util.Map;

public class Assignmet5 {

    public static void main(String[] args) {

        Map<String ,String > map = new HashMap<>();
        map.put("c1","blue");
        map.put("c2","green");
        map.put("c11","red");
        map.put("c1","pink");
        map.put("c21","white");

        String key = (map.size()<5) ? null :"c2";

        map.put(key,"green");
        map.put("null","null");
        map.put(null,null);
        map.put(null,null);

        System.out.println(map.size());
    }
}
