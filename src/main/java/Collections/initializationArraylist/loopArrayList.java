package Collections.initializationArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class loopArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(15);
        numbers.add(20);
        numbers.add(24);
        numbers.add(30);

        /* For Loop for iterating ArrayList */
        System.out.println("Foor Loop");
        for (int counter = 0;counter < numbers.size();counter++){

            System.out.println(+numbers.get(counter));
        }

        /* Advanced For Loop*/

        System.out.println( "Advanced For Loop");
        for (int num: numbers
             ) {
            System.out.println(num);
        }

        /* While Loop for iterating ArrayList*/

        System.out.println("While loop");

        int count = 0;
        while (numbers.size() > count){
            System.out.println(numbers.get(count));
            count++;
        }

        /*Looping Array List using Iterator*/

        System.out.println("Iterator");

        Iterator iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
