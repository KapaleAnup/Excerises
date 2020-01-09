package javaInterviewQuestions.javaPrgramas;

import java.util.Arrays;
import java.util.regex.Pattern;

public class StringToArrayExample {

    public static void main(String[] args) {

        String line = "My name is anup";

        String[] word = line.split(" ");

        System.out.println(Arrays.toString(word));

        Pattern pattern = Pattern.compile(" ");
        word =  pattern.split(line);
        System.out.println(Arrays.toString(word));
    }
}
