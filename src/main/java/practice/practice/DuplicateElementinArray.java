package practice.practice;

public class DuplicateElementinArray {

    public static void main(String[] args) {

        String[] str = {"java", "C#", "python", "java"};

        boolean status = false;

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (str[i] == str[j]) {

                    System.out.println("Duplicate element found " + str[i]);
                    status = true;
                }

                if (status == false) {
                    System.out.println("no duplicate");
                }

            }
        }

    }
}



