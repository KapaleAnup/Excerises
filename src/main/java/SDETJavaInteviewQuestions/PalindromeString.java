package SDETJavaInteviewQuestions;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your data: ");

       String str = scanner.next();

       String original = str;

       String rev = "";

      int lenght = str.length();

      for(int i = lenght-1; i>=0;i--){

          rev = rev+str.charAt(i);
      }

      if(original.equals(rev)){
          System.out.println(original+ " palindrome string");
      }

      else{
          System.out.println(original+ " Not palindrome string");
      }
      }


}
