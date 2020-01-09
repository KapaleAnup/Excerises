package Collections.HashMapTutorials;

import java.util.HashMap;

public class HashmapUses {


    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id","001");
        map.put("Firstname","Anup");
        map.put("Lastname","Kapale");

        System.out.println(map.hashCode());



    }
}
