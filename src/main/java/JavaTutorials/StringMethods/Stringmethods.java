package JavaTutorials.StringMethods;

public class Stringmethods {

    public static void main(String[] args) {

        String s ="Welcome      test";

       System.out.println(s.length()); //define lennth

        //Concat

        String s1 = "Welcome to ";
        String s2 = "Home";

        System.out.println(s1+s2);
        System.out.println(s1.concat(s2)); // Concatanating the String
        System.out.println("Welcome to ".concat("Training"));

        //Equals

        String s3 ="WELCOME";
        String s4 ="WELCOMe";

        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));

        //Contains => verify certain charcaters.

        System.out.println( s3.contains("COME"));

        //Substring()

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(0, 3));


        //replace

        System.out.println( s.replace('e','t'));
        //Split

       System.out.println( s.trim());


    }
}
