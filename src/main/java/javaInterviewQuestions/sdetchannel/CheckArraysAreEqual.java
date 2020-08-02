package javaInterviewQuestions.sdetchannel;

import java.util.Arrays;

public class CheckArraysAreEqual {

    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};

        int a2[] = {1, 2, 3, 4, 5};

        //Approch 1

     /*   boolean status = Arrays.equals(a1,a2);

        if(status == true){
            System.out.println("Arrays are equal.");
        }*/


     // Approch 2

        boolean status = true;

        if(a1.length == a2.length){

            for(int i=0;i<a1.length;i++){

                if (a1[i] !=a2[i]){
                    status = false;
                }
            }

        }
        else {
            status =false;
        }
        if(status == true){
            System.out.println("Array is equal.");
        }else {
            System.out.println("Array is not equal.");
        }
    }



}
