package SDETJavaInteviewQuestions;

public class RemoveWhitespace {

    public static void main(String[] args) {

        String str = "Java selenium learing    ter    ";

        str = str.replaceAll("\\s","");

      // str = str.trim();

        System.out.println(str);
    }
}
