package BeginerBooks;

public class loops {

    //Program to find the sum of natural numbers using while loop


    public static void main(String[] args) {
        int num = 10, count, total = 0;

      /*  while (count <= num){

            total = total +count;
            count++;

        }

        System.out.println("Sum of first 10 natural numbers is: "+total);*/
        // }

        //Program to find the sum of natural numbers using for loop

        for (count = 1; count <= num ;count++) {
            total = total + count;
        }
        System.out.println("Sum of first 10 natural numbers is: " + total);
    }
}



