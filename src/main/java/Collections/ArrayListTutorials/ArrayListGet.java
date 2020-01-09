package Collections.ArrayListTutorials;

import java.util.ArrayList;

public class ArrayListGet {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Anup");
        names.add("Anup");
        names.add("tom");
        names.add("harry");
        names.add("john");
        names.add("pranit");
        names.add("pratik");


        System.out.println("list of name :" +names);

        System.out.println("name of user is : "+ names.get(0));

    }
}
