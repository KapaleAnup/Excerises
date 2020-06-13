package javaInterviewQuestions.sdetchannel;

import java.util.ArrayList;
import java.util.List;

public class MissingNumberInAnArray {

    public static void main(String[] args) {

        int a[] ={1, 3, 4, 5, 6};

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0;i<a.length;i++){
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of elements in an array is: " + sum1);

        for (int i=0;i<=6;i++){
            sum2 = sum2 + i;
        }

        System.out.println("Sum of elements in an array is: " + sum2);

        int sum = sum2 - sum1;

        System.out.println("Missing element is : "+ sum);


        }
    }

