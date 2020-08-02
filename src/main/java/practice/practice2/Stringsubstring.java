package practice.practice2;

public class Stringsubstring {


    public static void main(String[] args) {

        String str = "This is java";


        System.out.println(str.toUpperCase().contains("java"));
        System.out.println(str.substring(str.indexOf("j")));
        System.out.println(str.split(""));

//        for(int i=0; i<str.length();i++){
//            for(int j= i+1;j<str.length();j++){
//
//                System.out.println(str.substring(i, j));
//            }
//        }
    }
}
