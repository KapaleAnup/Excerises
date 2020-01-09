package javaInterviewQuestions.DataFlair;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        m(list);


    }

    private static void m(List<Integer> list) {
        System.out.println(list);
    }


}
