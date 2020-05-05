package ProgramingExcersise;

public class LargestNumberFromArray {

    public static void main(String[] args) {

        int num[] = {12,86, 34, 56, 66, 76};

        int max = num[0];

        /**
         * Iterate array using a for loop (exclude arrays first position 0, since it was assumed as max value)
         *
         */
        for (int i=1; i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("The Given Array Element is:");

        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        System.out.println("From The Array Element Largest Number is:" + max);
    }
}
