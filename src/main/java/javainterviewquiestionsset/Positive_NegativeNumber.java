package javainterviewquiestionsset;

import java.util.Scanner;

public class Positive_NegativeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double number =  scanner.nextDouble();

        if(number > 0.0){
            System.out.println(number + " is positive number.");
        }else if (number <0.0){
            System.out.println(number + " is negative number.");
        }else {
            System.out.println(number + " is Zero.");
        }
        scanner.close();

    }
}
