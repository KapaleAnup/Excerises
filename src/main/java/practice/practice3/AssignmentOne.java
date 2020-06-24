package practice.practice3;

public class AssignmentOne {


    public static void main(String[] args) {


        String level = " green";

        int score = 0;

        switch (level){
            case "Yello":
                score++;
            case "green":
            case "blue":
                score++;
            case "red":
                score++;
            case "pink":
                score++;

                default:

        }
        System.out.println("Your score is : "+ score);

    }
}
