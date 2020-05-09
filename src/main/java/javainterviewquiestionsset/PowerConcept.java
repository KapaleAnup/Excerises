package javainterviewquiestionsset;

import java.util.Scanner;

public class PowerConcept {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base : ");
        int base = scanner.nextInt();

        System.out.println("Enter the Exponent : ");
        int exponent= scanner.nextInt();

        int result = 1;

        while (exponent !=0){
            result *= base;
            --exponent;
        }


        System.out.println("Result is : " + result);
        scanner.close();
    }
}
