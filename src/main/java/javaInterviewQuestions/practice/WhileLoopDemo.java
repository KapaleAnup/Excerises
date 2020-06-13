package javaInterviewQuestions.practice;

public class WhileLoopDemo {

    public static void main(String[] args){

        int count = 6;

        while (count <=5){

            try {
                System.out.println("value of count is : "+ count);
                count++;
            }catch (Exception e) {
                try {
                    throw new Exception("Out of index.");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }


        }

    }
}
