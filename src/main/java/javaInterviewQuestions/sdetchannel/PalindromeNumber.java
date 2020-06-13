package javaInterviewQuestions.sdetchannel;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int rev = 0;

        int original_number = number;

        while (number!=0){
            rev = rev * 10 + number %10;
            number=number/10;
        }

        if(rev == original_number){
            System.out.println("polindrome number: " + original_number);
        }else {
            System.out.println("Not a polindrome number:  " + original_number);
        }
    }
}
