package in.co.inheritance;

public class rectangleSet extends shapeSet {
    private  int length;
    private int breadth;

    public void setLength (int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
