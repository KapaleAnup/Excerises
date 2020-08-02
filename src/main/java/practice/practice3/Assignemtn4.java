package practice.practice3;

public class Assignemtn4 {

    public static void main(String[] args) {
        String str1 = "    it is short string";
        System.out.println(str1.matches(".*\\Wit\\W.*")+" ");
        System.out.println(str1.matches(".*\\sit\\s.*")+" ");
        System.out.println(str1.matches(".*it.*")+" ");
        System.out.println(str1.matches(".*it\\s.*")+" ");
    }
}
