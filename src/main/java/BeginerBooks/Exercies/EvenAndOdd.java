package BeginerBooks.Exercies;

import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        checkEvenOddNumber();
    }

    public static void checkEvenOddNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if( number%2 == 0 ){
            System.out.println("The nunber is Even.");
        }else {
            System.out.println("The number is Odd.");
        }

        scanner.close();
    }
}
