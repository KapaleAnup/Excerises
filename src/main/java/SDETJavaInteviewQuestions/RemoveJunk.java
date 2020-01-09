package SDETJavaInteviewQuestions;

public class RemoveJunk {

    public static void main(String[] args) {

        String s = "@#$@$$@ testing java";

      s  =  s.replaceAll("[^a-zA-z0-9]","");
        System.out.println(s);
    }
}
