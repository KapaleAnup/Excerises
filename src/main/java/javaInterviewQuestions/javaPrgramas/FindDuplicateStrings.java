package javaInterviewQuestions.javaPrgramas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicateStrings {


    public static void findDublicate(String str){

        //split the string with space

        Map<String, Integer> map = new HashMap<String, Integer>();

      String[] s =  str.split(" ");

       // System.out.println(s.toString());

        for (String tempString : s
             ) {
            if (map.get(tempString) != null) {

                map.put(tempString, map.get(tempString) + 1);
            } else {
                map.put(tempString, 1);
            }
        }


    Iterator<String> tempString = map.keySet().iterator();
        while (tempString.hasNext()){
           String temp=  tempString.next();
           if(map.get(temp) > 1){
               System.out.println(temp + " :  "+map.get(temp));
           }
        }

    }

    public static void main(String[] args) {

        findDublicate(" J K K K R K T J ");
    }
}
