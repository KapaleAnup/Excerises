package javaInterviewQuestions.DataFlair;

import org.apache.bcel.classfile.InnerClass;

import java.util.*;

public class comparatorTest {

    public static void main(String[] args) {

        String [] ar  = {"c","d","b","a","e"};
        List<String> listsort =new ArrayList<String>();;


       InnerClass in = new InnerClass();

     //  ArraysTest.parallelSort(ar, in);
        for (String alphabet:ar){
            System.out.println("Characters are\n"+alphabet);
            //listsort=new ArrayListDemo<String>();
            listsort.add(alphabet);
        }
        Collections.sort(listsort);
        System.out.println(listsort);
    }

    static class InnerClass implements Comparator<String>{
        public int compare(String s1, String s2)
        {

            return s2.compareTo(s1);
        }
    }
}
