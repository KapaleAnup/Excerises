package javaInterviewQuestions;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String args[]){

      int num = 123456;
         //   int num = 0;
        int reversernumer = 0;
       /* System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        //Captured input would be stored in number num
        num = in.nextInt();*/
        while (num!=0){

            reversernumer = reversernumer * 10;
            reversernumer = reversernumer + num%10;

            num = num/10;


        }

        System.out.println("reverser nunber is:" +reversernumer);



    }
}
