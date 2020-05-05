package BeginerBooks.Exercies;

public class CalculateCompoundInterest {

    public static void main(String[] args) {

        calcualeInterest(2000, 5, 0.08, 12);
    }

    public static void calcualeInterest(int p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r/n), n * t);
        double intrest = amount -  p;
        System.out.println("Compound Interest after " + t + " years: "+ " $ "+intrest);
        System.out.println("Amount after " + t + " years: "+ "$ "+amount);

    }
}
