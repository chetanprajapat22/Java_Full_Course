package in.co.Interface;

public class circle implements shape{
    double pi = 3.14;
    int radius;
    circle(int radius){
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("circle has been draw");

    }

    @Override
    public double area() {
        return (Double)(pi*radius*radius);
    }
}
 