package in.co.polymorphismusingreturn;

public class Circle extends shape {
    private  double radius;
    public Circle(){

    }
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
