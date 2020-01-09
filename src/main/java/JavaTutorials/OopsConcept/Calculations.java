package JavaTutorials.OopsConcept;

public class Calculations {

    int a;
    int b;


//    void sum(){
//        System.out.println(a+b);
//    }

        void sum(int x, int y){
            a=x;
            b=y;
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        Calculations cal = new Calculations();
//        cal.a= 100;
//        cal.b=200;
        cal.sum(100, 200);


    }
}
