package in.co.inheritance;

public class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(String color, int borderWidth,int length, int breadth) {
        super(color, borderWidth);

        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }
    public int getLength(){
        return length;
    }

    @Override
    public int getBorderWidth() {
        return super.getBorderWidth();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
