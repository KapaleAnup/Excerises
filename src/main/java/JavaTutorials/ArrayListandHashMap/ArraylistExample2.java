package JavaTutorials.ArrayListandHashMap;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample2 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("elcome");
        list.add(10);
        list.add(10.4);
        list.add('c');

        System.out.println("Size is : "+list.size());

        list.add(3, "testing");  // inserting elements into the array list
        list.add(1,2342);  // 1 is not an idex or possiton it describes the next number

        System.out.println("Arraylist is : "+list);

        list.remove("elcome");
        System.out.println("Arraylist is : "+list);

        getlist();
    }


    public static void getlist(){

       // int simple array[] = new array[5]

        ArrayList<Integer> list = new ArrayList<Integer>(5);

        list.add(1);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(5);

        for(Integer x : list){
            System.out.println(x);
        }
       // Collections.sort(list.iterator().hasNext();
    }
}
