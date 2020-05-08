package javainterviewquiestionsset;

public class VowelAndConstants {

    public static void main(String[] args) {

        // a , e, i, o, u

        /** ifelse is  one way of handling the case.
        char ch = 'k';

        if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
            System.out.println(ch + " is vowel");
        }else {
            System.out.println( ch + " is constants");
        }

         **/

        // Swith case

        char ch = 'm';

        switch (ch){
            case  'a':
            case  'e':
            case  'i':
            case  'o':
            case  'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is constant");
                break;
        }
    }
}
