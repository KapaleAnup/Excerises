package javaInterviewQuestions.sdetchannel;

public class CountEvenAndOddNumberInDigit {

    public static void main(String[] args) {

        int number = 123456789;   // declare number value.

        int even_count=0;  // assign variable for even
        int odd_count =0; // assign variable for odd

        while (number>0){  // check number should be greater than zero

          int reminder = number%10;  // divide the number by 10 to take the reminders,which will read from last digit.

            if(reminder%2==0){
                even_count++;
            }
            else {
                odd_count++;
            }

            number= number/10;
        }

        System.out.println("Even digits are : " + even_count);

        System.out.println("Odd digits are : " + odd_count);

    }
}
