package practice.practice;

public class MissingNumber {

    public static void main(String[] args) {

        int[] a1 ={1, 2, 4, 5};

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0;i<a1.length;i++){
            sum1 = sum1 + a1[i];
        }

        for(int i=1;i<=5;i++){
            sum2 = sum2 + i;
        }
        System.out.println(sum1);
        System.out.println(sum2);

        int missingNUmber = sum2 - sum1;

        System.out.println(missingNUmber);
    }
}
