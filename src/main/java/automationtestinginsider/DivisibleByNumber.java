package automationtestinginsider;

public class DivisibleByNumber {

    public static void main(String[] args) {

        int num = 100;
        int divisor = 5;
        for(int i=1;i<=num;i++){

            if(i%divisor==0){
                System.out.println(+divisor+ " divisible by :"+ i + " ,");
            }else {
                System.out.println(i+ ",");
            }
        }
    }
}
