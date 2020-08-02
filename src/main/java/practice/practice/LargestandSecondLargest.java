package practice.practice;

public class LargestandSecondLargest {

    public static void main(String[] args) {

        int[] a = {10, 20, 50, 30, 40, 50};

        int largest = a[0];
        int secondLargest = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];

            }else if(a[i]>secondLargest){
                secondLargest = a[i];

            }else {
                System.out.println("Duplicate number found");
            }
        }
        System.out.println("largest : "+largest);
        System.out.println("Secondlargest : "+secondLargest);




    }
}
