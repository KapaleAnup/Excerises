package BeginerBooks.Exercies;

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {

        int number1, number2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        number1 = scanner.nextInt();


        System.out.println("Enter the Second number");
        number2 = scanner.nextInt();



        sum = number1 + number2;
        scanner.close();

        System.out.println("Sum of two number is :" + sum);
    }



}
