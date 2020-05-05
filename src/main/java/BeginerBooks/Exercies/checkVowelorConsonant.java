package BeginerBooks.Exercies;

import java.util.Scanner;

public class checkVowelorConsonant {

    public static void main(String[] args) {

        checkvowelorconstat();
    }

    public static void checkvowelorconstat(){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter the character");
       char ch =  scanner.next().charAt(0);

       boolean isvowel = false;

       switch (ch){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':

               isvowel = true;


       }

       if(isvowel == true){
           System.out.println(ch + " is  a vowel");
       }
       else {
           if((ch > 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
               System.out.println(ch+" is a Consonant");
           }
           else {
               System.out.println("Input is not an alphabet");
           }
       }
    }
}
