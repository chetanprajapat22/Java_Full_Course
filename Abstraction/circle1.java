package in.co.Abstraction;

public class circle1 extends Shape1{
    double radius;

    public circle1(String color , double radius){
        super(color);
        System.out.println("circle constructor called");
    }
    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "circle color is " + super.getColor() + "And area is: " + area();
    }
}
