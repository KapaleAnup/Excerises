package practice.practice1;

public class CountNumberOfDigits {


    public static void checkCountInDigits(long num){

        int count =0;

        while (num>0){
            num = num /10;
            count++;
        }

        System.out.println("Count is : " + count);

    }

    public static void main(String[] args){
        checkCountInDigits(1234530003);
    }
}
