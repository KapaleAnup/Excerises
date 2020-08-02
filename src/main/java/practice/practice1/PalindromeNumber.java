package practice.practice1;

public class PalindromeNumber {

    public static void checkPalindromeNumber(int num){


        int original_num = num;
        int rev =0 ;

        while(num!=0){
            rev = rev * 10 +num %10;
            num = num /10 ;

        }

        if(original_num==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }


    }

    public static void main(String[] args) {
        checkPalindromeNumber(16461);
    }
}
