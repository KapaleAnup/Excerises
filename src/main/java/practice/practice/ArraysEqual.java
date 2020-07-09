package practice.practice;

public class ArraysEqual {

    public static void main(String[] args){

        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {1, 2, 3, 4, 9, 8};

        boolean flag = true;

        if(a1.length == a2.length){
           for(int i = 0;i<a1.length;i++){
               if(a1[i]==a2[i]){
                   flag = true;
               }
           }

        }
        else {
            flag = false;
        }

        if (flag == true) {

            System.out.println("arrays are equal");
        }
        else {
            System.out.println("arrays are not equal");
        }

    }
}
