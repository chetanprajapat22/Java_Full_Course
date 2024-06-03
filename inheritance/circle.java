package in.co.inheritance;

public class circle extends Shape {
    private  int radius;

    public circle(String color, int borderWidth,int radius) {
        super(color, borderWidth);
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
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
        return 3.14*radius*radius;
    }
}
