package practice.practice;

public class EvenAndOddArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int even = 0;
        int odd = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                System.out.println("even");
            }

            for (i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(arr[i]);
                    System.out.println("odd");
                }


            }
        }
    }
}

