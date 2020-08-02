package techdelight;

public class FindPair {

    //arr = [8,3, 2, 4, 5, 6];
    // sum =10;

    public static void findPair(int[] num , int sum){


        for(int i=0;i<num.length-1;i++){

            for (int j=i+1;j<num.length;j++){

                if(num[i] + num[j]== sum){
                    System.out.println("Pair found at the index : " +i + " and "+ j);
                    return;
                }
            }
        }
        System.out.println("Pair is not found.");


    }

    public static void main(String[] args) {

        int[] num = {9, 2, 4,5,7,3,6};
        int sum= 10;

        findPair(num,sum);
    }
}
