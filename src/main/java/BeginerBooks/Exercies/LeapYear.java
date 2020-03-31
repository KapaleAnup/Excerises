package BeginerBooks.Exercies;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        checkLeapYear();
    }

    public static void checkLeapYear(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter year :");

        int leapYear = scanner.nextInt();

        boolean isleap = false;

        if(leapYear % 4 == 0){
            if(leapYear %100 == 0){
                if(leapYear % 400 == 0){
                    isleap = true;
                }else {
                    isleap = false;
                }


            }else {
                isleap = true;
            }
        }else {
            isleap = false;
        }

        if(isleap == true){
            System.out.println( leapYear + " is a leap year");
        }else {
            System.out.println(leapYear + "is not a leap year" );

        }
    }
}
