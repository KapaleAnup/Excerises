package practice.practice3;

public class aas3 {

    public static void main(String[] args) {
         String str1 = "# IAmString #";
        String str2 =  str1.replace('#','\u0000').trim();
        System.out.println(str2.length());
    }
}
