package javaInterviewQuestions.sdetchannel;

public class FIndEvenandOddNumberFromArray {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i=0;i<a.length;i++){

            if(a[i]%2==0){
                System.out.println("Even number: "+ a[i]);
            }

        }


        for(int i=0;i<a.length;i++){
            if(a[i] % 2 !=0){
                System.out.println("Odd number: " + a[i]);
            }
        }


        for (int value:a
             ) {
            if(value%2==0){
                System.out.println(value);
            }
        }

    }
}
