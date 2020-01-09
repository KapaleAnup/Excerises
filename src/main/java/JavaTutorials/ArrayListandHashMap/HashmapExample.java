package JavaTutorials.ArrayListandHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String> ();
        map.put(123,"Anup");
        map.put(153, "test");
        map.put(2334,"fghjk");


        System.out.println(map);

        System.out.println( map.size());

        for (Map.Entry m:map.entrySet()
             ) {
            System.out.println(m.getKey() +" "  + m.getValue());
        }

    }
}
