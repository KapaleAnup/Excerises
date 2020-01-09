package JavaTutorials.programingKnowledge;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListvsArrayListTutorial {


    public static void main(String[] args) {

        long n = (long) 1E7;

        ArrayList arrayList = new ArrayList();

        long milis = System.currentTimeMillis();

        for (int i =0; i<n;i++){
            arrayList.add(i);
        }

        System.out.println("insert arraylist takes: "+ (System.currentTimeMillis()-milis)+" ms");

        LinkedList linkedList = new LinkedList();

        milis = System.currentTimeMillis();

        for (int i= 0; i<n;i++){
            linkedList.add(i);
        }
        System.out.println("insert Linkedlist takes: "+(System.currentTimeMillis()-milis)+" ms");


        // remove
        arrayList.remove(0);
        System.out.println("Deletion arraylist takes: "+ (System.currentTimeMillis()-milis)+" ms");

        linkedList.remove(0);
        System.out.println("Deletion LinkedList takes: "+ (System.currentTimeMillis()-milis)+" ms");

        // Search
        arrayList.get((int)n/2);
        System.out.println("Search arraylist takes: "+ (System.currentTimeMillis()-milis)+" ms");

        linkedList.get((int)n/2);
        System.out.println("Search LinkedList takes: "+ (System.currentTimeMillis()-milis)+" ms");
    }
}

