package codesdope;

public class SumOfNumbers {

    public static void main(String[] args) {

        int[] num ={2,4,5};

        int sum=0;

        for (int i=0;i<num.length;i++){

            sum = sum + num[i];
        }

        System.out.println("Sum is :" +sum);




    }
}
