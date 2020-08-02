package javaInterviewQuestions.sdetchannel;

import org.testng.annotations.Test;

import java.util.HashSet;

public class DuplicateElementInArray {


    @Test
            private static void approch1(){
        String arr[] = {"java", "c++", "c","python", "Java"};

        boolean flag = false;
        for(int i=0; i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println("Found duplicate elements : "+ arr[i]);
                    flag = true;
                }
            }
        }
        if(flag == false){
            System.out.println("Found no duplicate elements ");
        }
    }


    @Test
    private static void approch2(){
        String arr[] = {"java", "c++", "c","python", "java"};

        HashSet<String> langs = new HashSet<>();

        boolean flag = true;

        for (String value:arr
             )
            if (langs.add(value) == false) {
                System.out.println("Found duplicate elements : " + langs);
                flag = true;
            }

        if(flag == flag){
            System.out.println("Not Found duplicate elements : "+ langs);
        }
    }




}
