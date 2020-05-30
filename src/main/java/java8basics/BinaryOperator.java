package java8basics;

public class BinaryOperator {

    public static void main(String[] args) {

        java.util.function.BinaryOperator<Integer> binaryOperator = (x1 ,x2 ) -> x1+x2;

        int sum  = binaryOperator.apply(12,10);

        System.out.println(sum);

    }
}
