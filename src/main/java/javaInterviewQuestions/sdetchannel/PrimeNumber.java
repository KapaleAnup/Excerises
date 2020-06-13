package javaInterviewQuestions.sdetchannel;

public class PrimeNumber {

    public static void main(String[] args) {

        //    prime number : should be divisible by 1 and it self

        int num = 25;

        int count = 0;

        if(num>1){
            for (int i=1;i<=num;i++){
                if(num%i==0)
                    count++;
            }
            if(count==2){
                System.out.println(" prime number: "+ num);
            }
            else {
                System.out.println("Not a prime number: "+ num);
            }

        }
        else {
            System.out.println(num +" :Not a prime number");
        }


    }
}
