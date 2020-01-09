package JavaTutorials.Arrays;

public class ArrayExamplsInteger {

    public static void main(String[] args) {

        int a[] = new int[5];

        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;


      //  System.out.println(a[3]);


        //using for loop identy the value

//     for(int i=0;i<=a.length;i++){
//            System.out.println(a[i]);
//        }
        
        
        //for each loop

        for (int i: a
             ) {
            System.out.println(i);
        }

    }
}
