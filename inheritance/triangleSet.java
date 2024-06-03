package in.co.inheritance;

public class triangleSet  extends shapeSet{
    private int height;
    private int base;

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return base*height/2;
    }
}
