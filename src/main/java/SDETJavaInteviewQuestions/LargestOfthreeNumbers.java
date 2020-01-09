package SDETJavaInteviewQuestions;

import java.util.Scanner;

public class LargestOfthreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number :");
        int a = scanner.nextInt();

        System.out.println("Enter Second number :");
        int b = scanner.nextInt();

        System.out.println("Enter Third number :");
        int c = scanner.nextInt();

        // approch 1 - Logic
        if (a > b && a > c){
            System.out.println( a + " is largest number");
        }
        else if(b > a && b > c){
            System.out.println( b + " is largest number");
        }
//        else if(c > a && c > b){
//            System.out.println( c + " is largest number");
//        }
        else {

            System.out.println(c + " is largest number");
              //  System.out.println( " None of the number is largest.");
            }
        }

    // approch 2 - Logic (Teriory
    }


