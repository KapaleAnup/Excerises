package Collections.initializationArraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {

    public static void main(String[] args) {

  /*      ArrayList<String> names  = new ArrayList<String>( Arrays.asList("Anup","Amey","Dipesh"));


        System.out.println("Names of users is : " + names);

    }*/


        ArrayList<String> cities = new ArrayList<String>(){{
            add("Delhi");
            add("Agra");
            add("Chennai");
        }};
        System.out.println("Content of Array list cities:"+cities);
    }
    }

