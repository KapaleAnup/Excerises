package Asignment;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;

import java.io.File;

public class Test {


    public static void main(String[] args) {

    //    nput:   str = "a,b%c"
    //    Output:  str = "c,b%a"


        String str = "a,b%c";

        String rev = "";
        int length = str.length();

        for(int i=length-1;i>=0;i--){

            rev = rev + str.charAt(i);

        }
        System.out.println(rev);










    }

}
