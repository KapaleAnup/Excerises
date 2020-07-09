package practice.practice;

public class Polindromenumber {

    public static void polidrome(int num){

        int rev = 0;
        int originalNumber = num;

        while (num!=0){
            rev = rev * 10 + num %10;
            num = num/10;
        }

        if(originalNumber==rev){
            System.out.println("polindrome");
        }else{
            System.out.println("not polindrome");
        }

    }

    public static void main(String[] args) {
        polidrome(16161);
    }
}
