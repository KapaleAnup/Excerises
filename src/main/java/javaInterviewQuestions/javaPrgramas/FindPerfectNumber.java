package javaInterviewQuestions.javaPrgramas;

public class FindPerfectNumber {

    public boolean isPerferct(int number){

        int temp = 0;

        for(int i =1; i<=number/2;i++){

            if(number%i==0){
                temp +=i;
            }
        }
        if(temp == number){
            System.out.println("The Number is perfect number");
            return true;
        }
        else {
            System.out.println("The number is not a perfect number");
            return false;
        }
    }

    public static void main(String[] args) {
        FindPerfectNumber perfectNumber = new FindPerfectNumber();
        System.out.println("Is perfect number: "+perfectNumber.isPerferct(54));
    }
}
