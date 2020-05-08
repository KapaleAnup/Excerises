package javainterviewquiestionsset;

public class LragestAmongThreeNumbers {

    public static void main(String[] args) {
        int a = 83;
        int b = 40;
        int c = 45;

        if(a>b && a >c){
            System.out.println("a is greatest number");
        }else if(b>c){
            System.out.println("b is greatest number");
        }else {
            System.out.println("c is greatest number");
        }
    }
}
