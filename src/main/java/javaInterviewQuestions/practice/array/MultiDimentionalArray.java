package javaInterviewQuestions.practice.array;

public class MultiDimentionalArray {

    public static void main(String[] args) {

        int arrValues[] [] = {{1,2,3}, {4,5,6},{7,8,9}};

        for (int i=0;i<arrValues.length;i++){
            for (int j=0; j<arrValues.length;j++){
                System.out.print(
                        arrValues[i][j]+
                                " ");
            }
        }

    }
}
