package javaInterviewQuestions;

import org.testng.annotations.Test;

public class ReverseString {

    // 1  : one method do reverse the string without using the reverse method.
    @Test
    public void reverseString(){

        String s = "Samsung";

        int lenght = s.length();  //take a length of the string.

        String reverse = "";  //to store temp reverse value.

        /*
        lenght-1 : to decrease the length from back
        i>=0  : i should be greated than 0.
        i-- : i decreasing, so that the last value gets omitted.
        */
        for(int i = lenght-1;i>=0;i--){
            reverse = reverse + s.charAt(i);  //append the varible so that the value gets added into the veriable.

        }

        System.out.println(reverse);
    }

    @Test
    public void reverseString2(){

        String s = "Samsung";
        StringBuffer stringBuffer = new StringBuffer(s);

        System.out.println(stringBuffer.reverse());
    }
}
