package SDETJavaInteviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

    public static void main(String[] args) {

        // approch 1 by using parrallel sort

        int a[] = {12, 44, 56, 78, 45};

//        System.out.println("Arrays before sort"+ Arrays.toString(a));
//
//        Arrays.parallelSort(a);
//
//        System.out.println("Arrays before sort"+ Arrays.toString(a));


        //apporch by using sort menthod
//        System.out.println("Arrays before sort"+ Arrays.toString(a));
//
//        Arrays.sort(a);
//
//        System.out.println("Arrays before sort"+ Arrays.toString(a));

        // Reverse Desending order
        Integer b[] = {12, 44, 56, 78, 45};
        System.out.println("Arrays before sort"+ Arrays.toString(b));

        Arrays.sort(b,Collections.reverseOrder());

        System.out.println("Arrays before sort"+ Arrays.toString(b));
    }
}
