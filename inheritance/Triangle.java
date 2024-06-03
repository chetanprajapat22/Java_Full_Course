package in.co.inheritance;

public class Triangle extends Shape {
    private int base;
    private int height;


    public Triangle(String color, int borderWidth,int height,int base) {
        super(color, borderWidth);
        this.base = base;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
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
        return base*height/2;
    }
}
