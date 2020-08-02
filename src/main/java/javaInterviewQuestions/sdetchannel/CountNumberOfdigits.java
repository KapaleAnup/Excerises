package javaInterviewQuestions.sdetchannel;

public class CountNumberOfdigits {

    public static void main(String[] args) {


        int number = 1234567;

        int count = 0;

        while (number>0){
            number = number/10;
            count++;
        }
        System.out.println("Count of digit is : " + count);
    }
}
