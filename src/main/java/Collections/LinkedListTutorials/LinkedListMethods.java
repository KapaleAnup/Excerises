package Collections.LinkedListTutorials;

import java.util.LinkedList;

public class LinkedListMethods {

    public static void main(String[] args) {

        LinkedList<String> names =  new LinkedList<String>();

        names.add("Anup");
        names.add("Amol");
        names.add("Amit");
        names.add("Rupesh");
        names.add("Vinakyak");
        names.add("Sourabh");
        names.add("Nilesh");

        System.out.println(" SIZE OF THE ARRAY IS : "+names.size());

        /*Add First and Last Element*/
        names.addFirst("Sunil");
        names.addLast("Sachin");

        /*Display Linked List Content*/
        System.out.println("Name of the persons are : " + names );

        /*This is how to get and set Values*/

      Object firtvar = names.get(1);
        System.out.println("First index: "+firtvar);

        Object secondvar = names.set(2,"Kapale");
        System.out.println("Second index: "+secondvar);

        /*Remove first and last element*/
        names.removeFirst();
        names.removeLast();

        System.out.println("Name of the persons after removing are : " + names );

        /* Add to a Position and remove from a position*/

        names.add(0,"Amey");
        names.remove(6);

        System.out.println("FINAL LIST OF NAMES ARE : " + names );
        System.out.println( names.getFirst());

       Object last = names.lastIndexOf(names);
        System.out.println(last);
    }

}

