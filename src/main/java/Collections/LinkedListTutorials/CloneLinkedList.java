package Collections.LinkedListTutorials;

import java.util.LinkedList;

public class CloneLinkedList {

    public static void main(String[] args) {

        LinkedList<String> names =  new LinkedList<String>();

        names.add("Anup");
        names.add("Amol");
        names.add("Amit");
        names.add("Rupesh");
        names.add("Vinakyak");
        names.add("Sourabh");
        names.add("Nilesh");

        System.out.println("List of old names are : "+names);

        LinkedList newnames= new LinkedList<String>();

        newnames = (LinkedList)names.clone();
        System.out.println("List of new names are : "+newnames);
    }


}
