package automationtestinginsider;

public class FizzBuz {

    public static void main(String[] args) {


        int n = 100;

        for(int i=1;i<=n;i++){

            if(i%15==0){
                System.out.println("FizzBuz"+ " ");
            }else if(1%5==0){
                System.out.println("Buz"+ " ");
            }else if(i%3==0){

                System.out.println("Fizz"+ " ");
            }else {
                System.out.println(i + " ");
            }

        }


    }
}
