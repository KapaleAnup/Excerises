package JavaTutorials.programingKnowledge;

import java.util.ArrayList;

public class ArrayListTutorial {


    public static void main(String[] args) {


        ArrayList<Integer> myList = new ArrayList<Integer>(6);

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);

        for (Integer x : myList
             ) {
            System.out.println(x);
        }

        System.out.println("Size of array is : " +myList.size());

        myList.remove(2);

        for (Integer x : myList
                ) {
            System.out.println(x);
        }

        System.out.println("Size of array is : " +myList.size());


        myList.set(0,10000);
     //   myList.clear();   clear the array by this method.
       if (myList.isEmpty()){
           System.out.println("You are clear");
       }
       else {
           System.out.println("Array is present");
       }

        for (Integer x : myList
                ) {
            System.out.println(x);
        }

        System.out.println("Size of array is : " +myList.size());

    }


}
