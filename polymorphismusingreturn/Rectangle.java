package in.co.polymorphismusingreturn;

public class Rectangle extends shape{
    private int length ;
    private int width;
    public Rectangle(){

    }
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
