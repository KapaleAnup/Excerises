package javaInterviewQuestions.sdetchannel;

public class UsingUnaryOperator {

    public static void main(String[] args)
    {
        int operand1 = 5, operand2 = 6, operand3 = 0, operand4 = 20, operand5 = 40;
        boolean condition = true;
        // pre-increment operator
        operand3 = ++operand1;// operand1 = operand1 + 1
        System.out.println("Value of operand3 (++operand1) = " + operand3);//operand3 = operand1;
        // post increment operator
        operand3 = operand2++;// operand3 = b
        System.out.println("Value of operand3 (operand2++) = " + operand3);//operand2 = operand2 + 1
        // pre-decrement operator
        operand3 = --operand4;// operand4 = operand4-1
        System.out.println("Value of operand3 (--operand4) = " + operand3);//operand3=operand4
        // post-decrement operator
        operand3 = --operand5;// operand3 = operand5
        System.out.println("Value of operand3 (--operand5) = " + operand3);// operand5 = operand5 - 1
        // Logical not operator
        System.out.println("Value of !condition =" + !condition);
    }

}
