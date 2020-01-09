package Collections.ArrayListTutorials;

import java.util.ArrayList;
import java.util.Collections;

public class ComapareArraylist {


    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("HYD");


        ArrayList<String> newcities = new ArrayList<String>();
        newcities.add("Pune");
        newcities.add("Mumbai");
        newcities.add("Tamilnadu");
        newcities.add("HR");

        ArrayList<String>  compare1 = new ArrayList<String>();

        for (String comparecities:cities) {
           compare1.add(newcities.contains(comparecities) ? "Yes" : "No");
            System.out.println(compare1);
        }


    }
}
