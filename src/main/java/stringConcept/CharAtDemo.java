package stringConcept;

public class CharAtDemo {

    public static void main(String[] args) {


            String text = "Welcome";

         System.out.println(text.charAt(1));

        System.out.println( text.length());

        for (int i=0; i<text.length()-1;i++){
            System.out.println(text.charAt(i));
        }

        //accurance of any word

        int countor = 0;

        for (int i = 0; i<=text.length()-1;i++){

            if (text.charAt(i)== 'e'){
                countor++;
            }

            System.out.println("Char 'e' occured" + countor + " times in the string");
        }


    }
}
