package javaInterviewQuestions.sdetchannel;

public class SumOffArray {

    public static void main(String[] args) {

        int array[] = {2, 4, 5, 6, 7, 9};

        int sum = 0;

        for(int i=0;i<=array.length-1;i++){
            sum = sum + array[i];
        }

        System.out.println(sum);
    }
}
