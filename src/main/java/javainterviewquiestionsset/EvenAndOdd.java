package javainterviewquiestionsset;


import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number :");

        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println( number + " number is EVEN");
        }
        else {
            System.out.println(number + " number is ODD");
        }

    }
    }


