package SDETJavaInteviewQuestions;

public class SwapToNumber {


    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        System.out.println("before swapping :" + a + " "+ b);

        // Logic  1) add third variable
//        int t = a;
//        a=b;
//        b= t;


        // Logic  2) use - and + without using third varaible

//        a = a+ b;
//        b= a- b;
//        a = a -b;



        // Logic  3) use * and / without using third varaible
        // a & b should not be zero

//        a = a * b;
//        b= a/b;
//        a = a/b;



        // Logic  4) use bitwise operator

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;




        // Logic  s) using single statement

        b = a+b-(a=b);

        System.out.println("After swapping :" + a + " "+ b);
    }

}
