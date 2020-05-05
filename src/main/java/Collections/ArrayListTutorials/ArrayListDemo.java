package Collections.ArrayListTutorials;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {


    public static void main(String[] args) {


        ArrayList <String> obj = new ArrayList<String>();
        obj.add("Anup");
        obj.add("Amey");
        obj.add("Vishal");
        obj.add("Dipesh");

        for (String names: obj) {
            System.out.println("List of names are :" + names);
            System.out.println(obj.indexOf(2));
        }

        obj.add(1,"TestAnup");
        obj.set(2,"TestAMEY");

        for (String names: obj

                ) {
            System.out.println("AfterupdatingList of names are :" + names);

        }

        System.out.println("size of the elements is  :" + obj.size());



    /*
    How to initialize an ArrayList
    Method 1: Initialization using ArraysTest.asList
    */


        Arrays.asList("Testuser","Welcome","timepass");
        System.out.println("Elements are:"+obj);

        ArrayList<String> cities = new ArrayList<String>(){{
            add("Delhi");
            add("Agra");
            add("Chennai");
        }};
        System.out.println("Content of Array list cities:"+cities);



        ArrayList<String> data = new ArrayList<String>();
        data.add("Tst");
        data.add("Tsdffdst");
        data.add("Tssdsfdfddt");

        System.out.println(data);

        ArrayList<String> data1 = new ArrayList<String>();

        data1.add("sdfsdfsf");
        data1.add("sfswerewr");

        data.addAll(data1);


        System.out.println(data);


    }






}
