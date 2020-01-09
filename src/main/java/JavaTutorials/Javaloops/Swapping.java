package JavaTutorials.Javaloops;

public class Swapping {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        int c;

        c=a;
        a=b ;
        b= c;

        System.out.println("Value of a after swapping :" + a);
        System.out.println("Value of b after swapping : " + b);


    }
}
