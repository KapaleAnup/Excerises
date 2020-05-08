package javainterviewquiestionsset;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        // Nautarl numebr : 1 t0 100 ;

        // sum : 1+2+3+4+5....+100 = 5050;

        int number = 100;
        int sum = 0;
        int sum1 = 0;

        for (int i =0;i<=number;i++){
            sum = sum +i ;
        }
        System.out.println("Sum is : " + sum);

        System.out.println("--------------");
        // can be use while loop

        int k = 1;
        while (k<=number){
            sum1 =sum1+k;
            k++;
        }
        System.out.println("Sum is : " + sum);
    }
}
