package in.co.inheritance;

public class shapeSet {

    private String color;
    private int borderwidth;
    private int length;
    private int breadth;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBorderwidth(int borderwidth) {
        this.borderwidth = borderwidth;
    }

    public int getBorderwidth() {
        return borderwidth;
    }
    public double area(){
        return length*breadth;
    }
}
