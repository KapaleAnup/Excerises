package Collections.ArrayListTutorials;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArraylist {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Sachin");
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Tendulkar");


        System.out.println("**** Array before swap ****");

        for (String swap : names
             ) {
            System.out.println(swap);
        }

        Collections.swap(names,2,3);

        System.out.println("****  After swap *****");

        for (String swap: names
             ) {
            System.out.println(swap);
        }
    }
}
