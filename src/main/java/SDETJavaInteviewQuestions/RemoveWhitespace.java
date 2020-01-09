package SDETJavaInteviewQuestions;

public class RemoveWhitespace {

    public static void main(String[] args) {

        String str = " Java   selenium learing";

        str = str.replaceAll("\\s","");

        System.out.println(str);
    }
}
