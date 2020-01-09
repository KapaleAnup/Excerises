package javaInterviewQuestions.javaPrgramas;

public class GenerateOTP {

    public static int generateOTP(){

        int otp = (int) (Math.random()*10000);

        return otp;
    }

    public static void main(String[] args) {
        System.out.println(generateOTP());
    }
}
