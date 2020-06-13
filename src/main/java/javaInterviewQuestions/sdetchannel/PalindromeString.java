package javaInterviewQuestions.sdetchannel;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = scanner.next();
        String original_string = str;

        String rev = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }

        if(original_string.equals(rev)){
            System.out.println("palindrome " + original_string);
        }else {
            System.out.println("Not palindrome " + original_string);
        }
    }
}
