package javaInterviewQuestions.practice.array;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

       int arrVar[] = new int[5];

        arrVar[0]= 1;
        arrVar[1]= 2;
        arrVar[2]= 3;
        arrVar[3]= 4;
        arrVar[4]= 5;

        for (int i= 0;i<arrVar.length;i++){
            System.out.println("index of element: " + i + ":"+arrVar[i]);
        }

    }
}
