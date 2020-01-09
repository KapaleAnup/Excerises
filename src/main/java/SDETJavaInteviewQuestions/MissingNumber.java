package SDETJavaInteviewQuestions;

public class MissingNumber {

    public static void main(String[] args) {

        int a[] = {1, 2,3, 4, 5, 6,8,9,10};

        int sum1 = 0;

        for (int value:a
             ) {

            sum1 = sum1+value;
        }
        System.out.println("Sum of array is : " + sum1);

        int sum2 = 0;

        for (int i=1;i<=10;i++){
            sum2 = sum2+i;
        }

        System.out.println("Sum of range in array is : " + sum2);

        System.out.println("Missing number in array is :" + (sum2 - sum1));
    }
}
