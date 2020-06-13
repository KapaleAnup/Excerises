package javaInterviewQuestions.practice.string;

import org.testng.annotations.Test;

public class StringLiteral {

    public static void main(String[] args) {

        String str = "Welcome";
        System.out.println(str.length()); // 7
        System.out.println(str.charAt(2)); // l
        System.out.println(str.substring(2)); // lcome
        System.out.println(str.substring(1, 5)); // elco
        System.out.println(str.concat("@test")); // Welcome@test
        System.out.println(str.equals(str));
        int text  = str.indexOf(2);
        System.out.println(text);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        String replaceValue = str.replace('e', 'a');
        System.out.println(replaceValue);

      //  throw  new RuntimeException();

        Double d = new Double(12.9);
        int value=  d.intValue();
        System.out.println(value);


    }

    @Test
    public void test(){
        Double d = new Double(12.9);

        System.out.println(d.intValue());
    }
}
