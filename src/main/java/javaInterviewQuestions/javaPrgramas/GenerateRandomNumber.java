package javaInterviewQuestions.javaPrgramas;

import java.util.Random;

public class GenerateRandomNumber {

    public static void main(String[] args) {



        Random random = new Random();

        // random integers in [0, 100]


        for(int i= 0;i<=100;i++){
            System.out.println(random.nextInt(100));
        }
    }

}
