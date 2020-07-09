package practice.practice;

public class polindromeString {

    public static void polindromestring(String str){

        String  rev = "";
        String original_string = str;
        int length = str.length();

        for(int i=length-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }

        if(original_string.equals(rev)){
            System.out.println("polindrome");
        }else{
            System.out.println("Not polindrome");
        }
    }

    public static void main(String[] args) {
        polindromestring("madam");
    }
}
