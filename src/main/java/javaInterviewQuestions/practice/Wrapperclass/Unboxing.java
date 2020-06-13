package javaInterviewQuestions.practice.Wrapperclass;

import java.util.ArrayList;

public class Unboxing {

   // Java Unboxing is reverse of Autoboxing, i.e. it converts wrapper class object into its corresponding primitive data type.
    public static void main(String[] args) {

        char charactr  = 'a';

        Character character1 = charactr;

        ArrayList<Integer>arrayList = new ArrayList<>();
        arrayList.add(25);
        int num = arrayList.get(0);
        System.out.println(num);
    }
}
