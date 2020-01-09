package JavaTutorials.Arrays;

public class ArrayExampleString {

    public static void main(String[] args) {

        String s [] = new String[4];

        s[0]= "Welcome";
        s[1]= "to";
        s[2]= "training";

        System.out.println(s.length);

        for (String i:s
             ) {
            System.out.println(i);
        }
    }
}
