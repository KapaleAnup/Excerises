package JavaTutorials;

public class Operators {



    public static void main(String[] args) {

        //Arithmatic Operators
        int a = 10;
        int b =20;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);

        System.out.println("-------------");

        //Relational operators ==> Returns boolen value

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        System.out.println("-------------");
        //Logical operators  ==> Returns boolen value

        boolean x = true;
        boolean y = false;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);
        System.out.println(!y);

        System.out.println("-------------");
        //Assignement operators
        int c=100 ;

        c=a;
        System.out.println(c);

        c++; //increment operator
        System.out.println(c);
        c--; //decrement operator
        System.out.println(c);
        c+=5 ; //increment by 5
        System.out.println(c);
        c-=5 ; //decrement by 5
        System.out.println(c);
    }

}
