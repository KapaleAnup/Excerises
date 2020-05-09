package javainterviewquiestionsset;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        // factorial number !5 = 5*4*3*2*1=120;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int fact = 1;

        for(int i=1;i<=number;i++){
            fact = fact*i;
        }
        System.out.println("factorial of " + number + " is :" + fact);
        scanner.close();
    }
}
