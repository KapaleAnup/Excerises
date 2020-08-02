package practice.practice1;

public class MinandMAxFromArray {

    public static void main(String[] args) {

        int a[] = {23, 45, 56, 67};

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }


        }
        System.out.println(max);
         System.out.println(min);
    }

}
