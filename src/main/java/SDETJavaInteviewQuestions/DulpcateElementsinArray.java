package SDETJavaInteviewQuestions;

import java.util.HashSet;

public class DulpcateElementsinArray {

    public static void main(String[] args) {

        //approach: 1

      String arr[] = {"java", "Python", "C++",".Net","SQL", "Java","python"};
        boolean flag= false;
        for (int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found : " + arr[i]);

                    flag = true;
                }
            }
        }
        if (flag = false) {

            System.out.println("Duplicate element NOT found");
        }

    }

        //approach: 2

        //HashSet will not allow to store duplicate elements.
        // if the Provided details in array are case sensitive it will not mark as duplicate, it means "Java" and "java" will be..
        // two other words in an array.

       /* HashSet<String> lang = new HashSet();

        boolean flag = false;
        for (String l:arr
             ) {

            if (lang.add(l)== false){
                System.out.println("Duplicate element found : " + l);
                flag = true;
            }
            }

        if(flag== false){

            System.out.println("Duplicate element NOT found");
        }

    }*/
}
