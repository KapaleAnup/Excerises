package javaInterviewQuestions.practice.Wrapperclass;

import java.util.ArrayList;

public class Autoboxing {
    // Java Autoboxing is used to automatically convert the primitive data types into corresponding objects.
    public static void main(String[] args) {

        char character = 'a';

        Character character1 = character;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        System.out.println(arrayList.get(0));
    }
}
