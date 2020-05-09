package javainterviewquiestionsset;

public class CheckAlphabet {

    public static void main(String[] args) {

        char c = 'T';

        if( (c >='a'&& c <='z') || (c >='A' && c <='Z')){
            System.out.println(c + " is an Alphabet");
        }
        else {
            System.out.println(c + " not an Alphabet");
        }
    }
}
