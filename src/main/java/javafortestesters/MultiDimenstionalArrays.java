package javafortestesters;

import org.testng.annotations.Test;

public class MultiDimenstionalArrays {

    @Test
    public void multidimenationArrays(){
        int [][] multi =  {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        for (int i=0;i<multi.length;i++){
            for (int j=1;j<=i;j++){
                System.out.println(multi[j][j]);
            }
            System.out.println(multi[i][i]);
        }
    }
    @Test
    public void print2DIntArray(){

        int [][] multi =  {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    @Test
    public void breakDemo(){
        int[] arraysOfInts=  { 32, 87, 3, 589,
                12, 1076, 2000,
                8, 622, 127 };

        int i;
        int searchFor = 127;

        boolean foundit =false;

        for (i=0;i<arraysOfInts.length;i++){
            if(arraysOfInts[i] == searchFor){
                foundit = true;
                break;
            }

        }
        if(foundit){
            System.out.println("Found " + searchFor + " at index " + i);
        }else {
            System.out.println(searchFor + " is not in the given array");
        }
    }
}
