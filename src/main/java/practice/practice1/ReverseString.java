package practice.practice1;

public class ReverseString {

    public static String reverseString(String str){

        String rev = "";

        int length = str.length();

        for(int i=length-1;i>=0;i--){

            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse string is :" + rev);

        return str;

    }

    public static void main(String[] args){
        reverseString("welcome");
    }
}
