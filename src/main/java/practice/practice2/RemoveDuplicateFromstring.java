package practice.practice2;


import java.util.Scanner;

public class RemoveDuplicateFromstring {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows =  scanner.nextInt();

        int noOfcount = 1;

        System.out.println("Here Is Your Pyramid");

        for(int i=noOfRows;i>0;i--)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=noOfcount;j++)
            {
                System.out.println("* ");
            }

            System.out.println();

            noOfcount++;

        }


    }
}
