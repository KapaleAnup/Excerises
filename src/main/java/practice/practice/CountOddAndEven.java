package practice.practice;

public class CountOddAndEven {

    public static  void countaEvenOdd(int num){

        int even_count =0;
        int odd_count = 0;

        while (num >0){

           int rem = num % 10;

           if(rem % 2 == 0){
               even_count++;
           }else {
               odd_count++;
           }
           num = num /10;
        }

        System.out.println(even_count);
        System.out.println(odd_count);

    }

    public static void main(String[] args) {
        countaEvenOdd(123456);
    }
}
