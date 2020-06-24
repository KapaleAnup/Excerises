package Geeksbyte;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {


        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");


       int num = scanner.nextInt();
        System.out.println("Enter elements : ");
        for(int i=0;i<num;i++){

            arr[i]=scanner.nextInt();
        }
        System.out.println("============= ");
        for (int i : arr
             ) {
            System.out.println(i);
        }

        scanner.close();
    }
}
