package javafortestesters;

import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;

public class StringLiterals {


    @Test
    public void manipulationforStrings(){

        String aString = "abcdef";
        System.out.println(aString.length());

        System.out.println("Bob said \"hello\" to his cat's friend");
        System.out.println("This is a single backslash \\");
        System.out.println("This is a single \n backslash");
        System.out.println("Bob said hello \t to his cat's friend");


    }

    @Test
    public void canConvertBytesUTF8() throws  UnsupportedEncodingException {
        byte[] b8Array = "hello there".getBytes("UTF8");
    }
}
