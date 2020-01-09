package SDETJavaInteviewQuestions;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a number : ");

        int number = scanner.nextInt();

        // logic 1 ) using algorithem

       /* int rev = 0;

        while (number!=0){

            rev = rev * 10 + number%10;
            number = number/10;
        }
    */

       // Using StringBuffer class

       StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));// convert number to string by using "String.valueOf()" method.
       StringBuffer rev = stringBuffer.reverse();

        System.out.println(" Reverse number is : " + rev);


        // Using StringBuilder class

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(number);
        StringBuilder rev1 = stringBuilder.reverse();
        System.out.println(" Reverse number is : " + rev1);
    }
}
