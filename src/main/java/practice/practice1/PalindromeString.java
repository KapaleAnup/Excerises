package practice.practice1;

public class PalindromeString {

    public static void checkPalindromeString(String str) {

        String original_str = str;

        String rev = "";

        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (original_str.equals(rev)) {
            System.out.println("Panidrome String");
        } else {
            System.out.println("Not a Panidrome String");
        }


    }

    public static void main(String[] args) {
        checkPalindromeString("eye");
    }
}
