package javaInterviewQuestions.sdetchannel;

import org.testng.annotations.Test;

public class ReverseString {
    String str = "Welcome";
    String rev = " ";
    @Test
    public void usingCancatanationOperator(){

        int length = str.length();

        for(int i=length-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    @Test
    public void usingCaracterArray(){

        char a[] = str.toCharArray();
        int length1 = a.length;

        for (int i=length1-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println(rev);
    }

    @Test
    public void usingStringBufferClass(){

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

    }
}
