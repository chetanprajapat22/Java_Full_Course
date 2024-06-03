package in.co.inheritance;

public class test {
    public static void main(String[] args) {

        Rectangle r = new Rectangle("red",3,5,3);
        System.out.println("**Rectangle**");
        System.out.println("Color: " + r.getColor());
        System.out.println("Bprderwidth: " + r.getBorderWidth());
        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());
//        r.area();
        System.out.println("Area of rectangle: " + r.area() );
        System.out.println("\n");

    Triangle t =  new Triangle("blue",3,7,3);
        System.out.println("**Triangle**");
        System.out.println("clor: " + t.getColor());
        System.out.println("bordrewidth: " + t.getBorderWidth());
        System.out.println("height: " + t.getHeight());
        System.out.println("base " + t.getBase());
        System.out.println("area of triangle " + t.area());
        System.out.println("\n");

        circle c =new circle("green",3,5);
        System.out.println("color: " + c.getColor());
        System.out.println("borderwidth: " + c.getBorderWidth());
        System.out.println("radius: " + c.getRadius());
        System.out.println("area of circle: " + c.area());
        System.out.println("\n");
    }
}
