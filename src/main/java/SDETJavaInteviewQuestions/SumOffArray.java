package SDETJavaInteviewQuestions;

public class SumOffArray {

    public static void main(String[] args) {

        int a[] = {3, 5, 6, 8};

        int sum = 0;

//        for (int i=0;i<=a.length-1;i++){
//            sum  = sum + a[i];
//
//        }

        // Enhanced loop

        for (int value: a
             ) {

            sum  = sum + value;
        }

        System.out.println("Sum of array is : " + sum);
    }
}
