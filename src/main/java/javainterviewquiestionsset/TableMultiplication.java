package javainterviewquiestionsset;

import java.util.Scanner;

public class TableMultiplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which want to multiply");

        int number = scanner.nextInt();

        int count = 10;

        for(int i =1;i<=count;i++){
            System.out.println(number + " x " + i + " = "+ (number*i));
        }
    }
}
