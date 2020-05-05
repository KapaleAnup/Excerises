package Collections.ArrayListTutorials;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {

        //Sorting for cities /strings
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Mumbai");
        cities.add("kolkata");
        cities.add("Bengaluru");
        cities.add("Ahmadabad");
        cities.add("Nahik");
        cities.add("Pune");


        for (String listofcities: cities
             ) {

            System.out.println("List of cities are :" + listofcities);
        }

        //List of cities after sorting

        Collections.sort(cities);

        for (String sortedlistofcites: cities) {


            System.out.println("Sorted list of cites are : "+ sortedlistofcites);
        }


        //Sorting for numeric data.

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(34);
        numbers.add(56);
        numbers.add(2);
        numbers.add(1);
        numbers.add(8);
        numbers.add(5);

        for (Integer listofnumbers: numbers
             ) {
            System.out.println("List of numbers are :" + listofnumbers);
        }

        //sorting in desending order

      // Collections.sort(numbers,Collections.<IntegerExampleTest>reverseOrder());  // use this method for assending order
     //   Collections.sort(numbers); // use this for sorting the numbers
        Collections.reverse(numbers); // use reverse() to reverse the listed numbers.

        for (Integer sortedNumbers:numbers
             ) {
            System.out.println("Sorted numbers are :" + sortedNumbers);
        }

        //sorting in desending order




    }
}
