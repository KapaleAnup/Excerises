package JavaTutorials.ArrayListandHashMap;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Anup");
        arrayList.add("AssignmentOne");
        arrayList.add("Testewqwe");

        System.out.println(arrayList.size());


        for (String s: arrayList     // reading arraylist from the array
             ) {

            System.out.println(s);
        }

    }
}
