package Collections.ArrayListTutorials;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        //add method returns Object class --> so that object class is a parent class and it can be stored any
        // data types.

        ArrayList list = new ArrayList();

        /**
         * Can add duplicate values
         * Can add null values
         * Can add multiple data types i.e integer, string, char , double, float, boolean, null.
         *
         */

        list.add(10);
        list.add(10);
        list.add("Anup");
        list.add('C');
        list.add(10.20);
        list.add(true);
        list.add(null);

        System.out.println(list);
        System.out.println(list.size());


        /**
         * How to fetch the value from the list
         */

        System.out.println(" Fetched value is : "+list.get(0));
       // System.out.println(" Fetched value is : "+list.get(8));
        System.out.println("Removed value is :"+ list.remove( 3));
        System.out.println(list.size());

        /**
         * for loop to retrive the values
         */
        System.out.println("********");
        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
    
        }

        /**
         * for each loop to retrive the values
         */
        System.out.println("********");

        for (Object var: list
             ) {
            System.out.println(var);
        }



    }
}
