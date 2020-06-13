package javaInterviewQuestions.sdetchannel;

public class MinAndMaxInArray {

    public static void main(String[] args){

        int a[] = {20, 40, 56, 50, 49};

        int max = a[0];
        int min =a[0];
        for(int i=1;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
            else if(a[i]<min){
                min =a[i];
            }

        }
        System.out.println("Maximum element in an array is : "+max);

        System.out.println("Minimum element in an array is : "+min);
    }
}
