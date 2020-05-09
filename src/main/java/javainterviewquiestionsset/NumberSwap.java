package javainterviewquiestionsset;

public class NumberSwap {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("before swaping : "  );
        System.out.println(a);
        System.out.println(b);

        System.out.println("After swaping : "  );

//        int temp;
//       temp = a;
//       a = b;
//       b= temp;
//        System.out.println(a);
//        System.out.println(b);


        // without temp veriable

        a = a - b;
        b= a + b;
        a = b - a;
        System.out.println(a);
        System.out.println(b);
    }
}
