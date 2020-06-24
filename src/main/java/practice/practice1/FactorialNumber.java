package practice.practice1;

public class FactorialNumber {

    public static void checkFactorial(int num){

        int factorial = 1;

        for(int i=1;i<=num;i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args){

        checkFactorial(5);
    }
}
