package ProgramingExcersise;

public class SecondLargestNumnberInAnArray {

    public static void main(String[] args) {

        int num[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85};
        int largest = num[0];
        int secondLargest = num[0];


        System.out.println("The given array is:" );

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        //find the largest

        for (int i=0;i<num.length;i++){
            if(num[i]>largest){
                secondLargest = largest;
                largest = num[i];
            }else if(num[i] > secondLargest){
                secondLargest = num[i];
            }
        }
        System.out.println("largest number is "+ largest);
        System.out.println("\nSecond largest number is:" + secondLargest);
    }
}
