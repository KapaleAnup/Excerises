package SDETJavaInteviewQuestions;

import java.util.Scanner;

public class PolindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = scanner.nextInt();

        int orgininal_number = num;

        int rev = 0;

        while (num!=0){
            rev = rev * 10 + num%10;
            num = num /10;
        }

        if(orgininal_number == rev){
            System.out.println(orgininal_number +" Provided number is polindrome");
        }
        else
        {
            System.out.println(orgininal_number + " Provided number is not polindrome");
        }
    }
}
