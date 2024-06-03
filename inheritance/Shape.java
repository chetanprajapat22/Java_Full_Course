package in.co.inheritance;

public class Shape {
    private String color;

    private int BorderWidth;

    public  Shape  (String color,int borderWidth){
        this.color = color;
        this.BorderWidth = borderWidth;
    }

    public String getColor() {
        return color;
    }

    public int getBorderWidth() {
        return BorderWidth;
    }

    public double area(){
        return 0;
    }
}
