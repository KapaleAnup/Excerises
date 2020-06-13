package javaInterviewQuestions.practice;

public class JavaNestedClass {

    public static void main(String[] args) {

        JavaOuterClass outerClass = new JavaOuterClass();
       JavaOuterClass.InnerClass innerClass =  outerClass.new InnerClass();
        System.out.println(innerClass.intValue());

    }
}
