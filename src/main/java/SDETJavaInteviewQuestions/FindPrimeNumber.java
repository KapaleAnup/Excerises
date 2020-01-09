package SDETJavaInteviewQuestions;

// prime number: the number will get divisible by 1 or itself

// number > 1
// two factor : divisible by 1 and itself.

// 19:
public class FindPrimeNumber {

    public static void main(String[] args) {

        int num= 3;
        int count = 0;

        if(num>1){
            for (int i=1;i<=num;i++) {
                if (num % i == 0)
                    count++;
            }

                if (count==2){
                    System.out.println("Prime number..");
                }
                else {
                    System.out.println("Not Prime number..");
                }
            }

        }



}
