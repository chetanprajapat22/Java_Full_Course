package in.co.polymorphismusingreturn;

public class Triangle extends shape{
    private int base;
    private int height;
    public Triangle(){

    }
    public Triangle(int base , int height){
        this.base =base;
        this.height = height;
    }

    @Override
    public double area() {
        return base*height;
    }
}
