package Interview;

public class Rectangle implements Shape {

    private  double width;
    private  double hight;
    public Rectangle(double w, double h){

        this.width = w;
        this.hight = h;
    }



    public void draw() {

        System.out.println("Drawing Rectangle");
    }

    public double getArea() {
        return this.hight*this.width;
    }
}
