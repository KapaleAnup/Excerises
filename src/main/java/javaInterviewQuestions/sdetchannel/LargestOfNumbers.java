package javaInterviewQuestions.sdetchannel;

import java.util.Scanner;

public class LargestOfNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();


        System.out.println("Enter Second number");
        int b = scanner.nextInt();


        System.out.println("Enter Third number");
        int c = scanner.nextInt();
//
//
//        if(a>b && a > c){
//            System.out.println(" A is greater.");
//        }
//        else if(b>a && b>c){
//
//            System.out.println(" B is greater.");
//        }
//        else {
//            System.out.println(" c is greater.");
//        }
//
//        scanner.close();

        // Ternary Operator

        int largest1 = a>b ? a:b;

        int largest2 = c > largest1 ? c : largest1 ;

        System.out.println(largest2);
    }
}
