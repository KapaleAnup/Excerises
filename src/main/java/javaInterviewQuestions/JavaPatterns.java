package javaInterviewQuestions;

import org.testng.annotations.Test;

public class JavaPatterns {

    @Test
    public void printAllStart(){

        for (int i= 1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println("*");
            }
        }
       System.out.println("\n");
    }


}
