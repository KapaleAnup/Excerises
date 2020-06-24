package SDETJavaInteviewQuestions;

public class ReverseWordfromString {



    public static void reverseWord(String str){

        int length = str.length();

       String[] word = str.split(" ");

       String reverseString  = "";

        for (String w:word
             ) {
            String wordreverse = "";
            for (int i=length-1;i>=0;i--){
                wordreverse = wordreverse +str.charAt(i);
            }

            reverseString = reverseString + wordreverse + " ";

        }

        System.out.println(reverseString);

    }
    public static void main(String[] args) {

        reverseWord("Welcome to java");
    }
}
