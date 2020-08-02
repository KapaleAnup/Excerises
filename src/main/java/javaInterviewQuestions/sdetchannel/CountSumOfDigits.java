package javaInterviewQuestions.sdetchannel;

public class CountSumOfDigits {

    public static void main (String[] args){

        int number = 1234;

        int sum = 0;

        while (number>0){
            sum = sum + number%10; // will provide a reminder and will get added in sum.
            number = number/10;
        }

        System.out.println(sum);
    }
}
