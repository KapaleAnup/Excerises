package javaInterviewQuestions.DataFlair;

import java.util.HashMap;

public class HashmapTest {

    public static void main(String[] args) {

        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(11, "anup");
        hashmap.put(2, "vijay");
        hashmap.put(null, "null");


        System.out.println(hashmap.keySet().contains("anup"));
//        System.out.println(hashmap.size());
//        System.out.println(hashmap);
    }
}
