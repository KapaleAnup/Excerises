package practice.practice;

public class MixMax {

    public static void main(String[] args) {

        int[] a = {12, 14, 34, 65, 67};

        int max = a[0];
        int min = a[0];

        for(int i=0;i<a.length;i++) {
            if (a[i] > max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }

        System.out.println("Max ix : "+ max);
        System.out.println("Min is : " + min
        );

    }
}
