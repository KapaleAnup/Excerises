package practice.practice1;

public class ArraysEqual {


    public static void main(String[] args){

        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {1, 2, 3, 4, 0};


        boolean status = true;

        if(a1.length == a2.length){
            for(int i=0;i<a1.length;i++){
                if(a1[i] != a2[i]){
                    status = false;
                }

            }
            if(status == true){
                System.out.println("Arrays are equal");
            }else{
                System.out.println("Arrays are not equal");
            }
        }
		else{
            status= false;
        }





    }
}
