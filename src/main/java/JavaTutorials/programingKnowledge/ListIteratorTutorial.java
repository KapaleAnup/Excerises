package JavaTutorials.programingKnowledge;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * public boolean hasNext();
 * public Object next();
 * public boolean hasPrevious();
 * public Object previous();
 */

public class ListIteratorTutorial {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Anup");
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Gopal");
        names.add("Naresh");


        ListIterator<String> iterator = names.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("******************");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
