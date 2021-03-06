package Collections.ArrayListTutorials;

import java.util.ArrayList;

public class CompateTwoArrayList {

    /*

   In this tutorial we will learn how to compare two ArrayList. We would be using contains() method for comparing two elements of different ArrayList.

public boolean contains(Object o)
It returns true if the list contains the Object o else it returns false.
     */


    public static void main(String[] args) {

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you");
        al1.add("Good Morning");
        al1.add("bye");
        al1.add("Good night");


        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Howdy");
        al2.add("Good Evening");
        al2.add("bye");
        al2.add("Good night");


        //Storing the comparison output in ArrayList<String>
        ArrayList<String> al3 = new ArrayList<String>();

        for (String temp : al1
             ) {
            al3.add(al2.contains(temp) ? "Yes" : "No");
            System.out.println(al3);
        }

        //Storing the comparison output in ArrayList<IntegerExampleTest>

        ArrayList<Integer> al4 = new ArrayList<Integer>();

        for (String numbers: al1
             ) {
            al4.add(al2.contains(numbers) ? 1 : 0);
            System.out.println(al4);
        }
    }
}
