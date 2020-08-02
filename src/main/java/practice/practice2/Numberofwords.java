package practice.practice2;

public class Numberofwords {


    public static void main(String[] args) {


        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {1, 2, 3, 4, 5};

        boolean status = false;

        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] == a2[i]) {
                    status = true;
                } else {
                    status = false;
                }
            }
        }
        if (status == true) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
