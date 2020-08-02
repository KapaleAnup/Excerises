package practice.practice1;

public class CountEvenAndOddNumberFromDogit {

    public static void checkCountOfEvenAndOddDigitNumber(int num){

        int even_count= 0;
        int odd_count = 0;

        while(num>0){
            // check the reminder
            int rem = num%10;

            if(rem % 2 == 0){
                even_count++;
            }else{
                odd_count++;
            }

            num = num/10;
        }

        System.out.println("Even count is " + even_count);
        System.out.println("odd count is " + odd_count);

    }

    public static void main(String[] args){
        checkCountOfEvenAndOddDigitNumber(12534543);
    }
}
