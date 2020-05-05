package Collections.ArrayListTutorials;

import java.util.ArrayList;

public class JoinTwoArray {

    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("AL1: E1");
        arrayList1.add("AL1: E2");
        arrayList1.add("AL1: E3");


        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("AL2: E1");
        arrayList2.add("AL2: E2");
        arrayList2.add("AL2: E3");


        ArrayList<String> allarraylist = new ArrayList<>();

        allarraylist.addAll(arrayList1);
        allarraylist.addAll(arrayList2);

        for (String temp: allarraylist
             ) {
            System.out.println(allarraylist);
        }

    }
}
