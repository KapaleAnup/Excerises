package javaInterviewQuestions.practice.array;

public class PassingArraytoMethod {

    public static void main(String[] args) {

        int arrVar[] = {1, 2, 3, 4};

        arraySum(arrVar);
    }

    private static void arraySum(int[] arrVar) {

        int arraySum=0;
        for (int i = 0;i<arrVar.length;i++){
            arraySum+=arrVar[i];
            System.out.println(arraySum);

        }
    }


}
