package javainterviewquiestionsset;

public class CountNumberOfDigits {


    public static void main(String[] args) {

        long number = 43243242443553453l;
        int count = 0;

        while (number !=0){
            number = number/10;
            count++;
        }

        System.out.println("number of digits are : " + count);
    }
}
