package SDETJavaInteviewQuestions;

public class SumOffArray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4,5};

        int sum = 0;

        for (int i=0;i<a.length;i++){
            sum  = sum + a[i];

        }
        System.out.println("Sum of array is : " + sum);

        System.out.println("************************");
        // Enhanced loop

        for (int value: a
             ) {

            sum  = sum + value;
        }

        System.out.println("Sum of array is : " + sum);
    }
}
