package JavaTutorials.Arrays;

public class TwoDimentinalArray {

    public static void main(String[] args) {

        int a [][]= new int[3][2];

        //storing values into array

        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

        a[2][0]=50;
        a[2][1]=60;

        //classic for loop
//        for(int i=0; i<=2;i++){  //incrementing the row
//            for(int j =0;j<=1;j++){ // incrementing the coloumn
//                System.out.println(a[i][j]);
//            }
//        }


        for (int i[]:a
             ) {
            for (int j:i
                 ) {
                System.out.println(j);
            }
          //  System.out.print();
            
        }
    }
}
