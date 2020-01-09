package Collections.ArrayListTutorials;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(13);
        arrayList.add(16);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(54);

        System.out.println(arrayList);

        System.out.println("For Loop ");

        /* For Loop for iterating ArrayList */

        for (int count = 0;count<arrayList.size();count++)
        {
            System.out.println(arrayList.get(count));
        }

        /**
         * Advance for loop
         */

        System.out.println("===============");

        for (Integer num: arrayList
             ) {

            System.out.println(num);
        }

        /* While Loop for iterating ArrayList*/


        System.out.println("While loop");

        int counter = 0;

        while (arrayList.size()>counter){

            System.out.println(arrayList.get(counter));
            counter++;
        }

        /*Looping Array List using Iterator*/

        System.out.println("Looping via interator");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
