package javaInterviewQuestions.practice;

public class JavaOuterClass {


    private int value = 60;

    class InnerClass {

        public int intValue() {
            System.out.println("This is the getValue method of inner class:");
            return value;
        }
    }

}
