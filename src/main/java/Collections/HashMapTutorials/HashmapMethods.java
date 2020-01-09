package Collections.HashMapTutorials;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapMethods {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Name");
        hashMap.put(2, "Address");
        hashMap.put(3, "City");
        hashMap.put(4, "State");
        hashMap.put(5, "Pincode");

        Set set =hashMap.entrySet();
        Iterator iterator= set.iterator();

        while (iterator.hasNext()){

            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.println("key is :" + mentry.getKey()+" value is :");
            System.out.println(mentry.getValue());
        }


        System.out.println(hashMap.isEmpty());
    }
}
