package javainterviewquiestionsset;

import java.util.Scanner;

public class FibonaccieSeries {

    public static void main(String[] args) {

        /*
        Adding the numbers:
        FibonaccieSeries ==> 0+1+1+2+3+5+8....
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check the FibonaccieSeries :");
        int number = scanner.nextInt();
        int count = 0 ;
        int temp1 = 0;
        int temp2 = 1;

        for (int i= 0;i<=number;i++){
            System.out.println(temp1);

            int sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }

    }
}
