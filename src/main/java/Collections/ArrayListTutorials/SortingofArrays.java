package Collections.ArrayListTutorials;

import java.util.ArrayList;
import java.util.Collections;

public class SortingofArrays {

    public static void main(String[] args) {

        ArrayList<String> listofcountries = new ArrayList<String>();

        listofcountries.add("India");
        listofcountries.add("Japan");
        listofcountries.add("China");
        listofcountries.add("Austrelia");
        listofcountries.add("Malesia");


        /*
        Note: if the first character is written in small letter, it will not sort alphabetically.
         */
        /*
        unserted list
         */

        System.out.println(" unserted list");

        for (String counter: listofcountries
             ) {
            System.out.println(counter);
        }

        /*
        sort statement
         */
        System.out.println("*********");
        System.out.println("sort statement");
        Collections.sort(listofcountries);
        Collections.EMPTY_LIST.size();



         /*
        sorted list
         */

        System.out.println("*********");
        System.out.println("After sorting");
        for (String counter: listofcountries
             ) {
            System.out.println(counter);
        }
    }
}
