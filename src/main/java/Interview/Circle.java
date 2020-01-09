package Interview;

public class Circle implements Shape {

    public double redius;

    public Circle(double r){

        this.redius=r;
    }
    public void draw() {

        System.out.println("Drawing circle");
    }

    public double getArea() {
        return Math.PI*this.redius*this.redius;
    }

    public double getRedius() {
        return this.redius;
    }
}
