package javafortestesters;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    @Test
    public void testMap(){
        Map<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        Map<String,String> maptoadd = new HashMap<>();

        maptoadd.put("key5", "value5");

        System.out.println(map.get(0));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(((HashMap<String, String>) map).clone());
        System.out.println(map.containsKey("key1"));
        System.out.println(map.containsValue("value2"));

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry :entries
             ) {
            entry.setValue("bob");
            System.out.println(entry);
        }




    }
}
