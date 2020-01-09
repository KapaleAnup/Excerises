package JavaTutorials.programingKnowledge;

import java.util.LinkedList;

public class LinkedListTutorial {

    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<String>();

        name.add("Anup");
        name.add("Amit");
        name.add("Anuja");
        name.add("Amol");
        name.add("pranit");
        name.add("TP");

        name.addFirst("Firstname");
        name.addLast("Lastname");
        name.set(1,"Shubham");

        System.out.println( name.equals("pranit"));
        System.out.println("name of first index is: "+name.get(1));
        System.out.println("Size of the aarray is : "+name.size());
        for (String x : name
             ) {
            System.out.println(x);
        }
    }
}
