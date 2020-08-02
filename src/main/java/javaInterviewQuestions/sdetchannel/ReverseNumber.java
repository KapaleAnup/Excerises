package javaInterviewQuestions.sdetchannel;

import org.testng.annotations.Test;

import java.util.Scanner;

public class ReverseNumber{


            @Test
            public void usingAlogrith(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();

        //1. using algorithm

        int rev = 0;
        while (number!=0){
            rev = rev*10+number%10;
            number = number/10;

        }

        System.out.println(rev);
        scanner.close();
    }


    @Test
    public void usingSringBufferClass(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();

        StringBuffer rev;

        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        rev = stringBuffer.reverse();
        System.out.println(rev);
        scanner.close();
    }


    @Test
    public void usingStringBuilder(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();

        StringBuilder rev;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        rev = stringBuilder.reverse();
        System.out.println(rev);

    }

}
