package in.co.inheritance;

public class testSet {
    public static void main(String[] args) {
        rectangleSet r= new rectangleSet();
        r.setBreadth(12);
        r.setLength(2);
        r.setBorderwidth(21);
        r.setColor("pink");
        System.out.println(" ** Rectangle **");
        System.out.println("breadth: " + r.getBreadth());
        System.out.println("length: " + r.getBreadth());
        System.out.println("border is: " + r.getBorderwidth());
        System.out.println("color: " + r.getColor());
        System.out.println("area of triangle: " + r.area());
        System.out.println("\n");



        triangleSet t = new triangleSet();
        t.setBase(23);
        t.setHeight(56);
        t.setBorderwidth(3);
        t.setColor("Blue");
        System.out.println(" ** Triangle ** ");
        System.out.println("Base: " + t.getBase());
        System.out.println("Height: " + t.getHeight());
        System.out.println("borderWidth of: "+ t.getBorderwidth());
        System.out.println("color: " + t.getColor());
        System.out.println("area of triangle: "+ t.area() );
        System.out.println("\n");



        circleSet c= new circleSet();
        c.setRadius(22);
        c.setBorderwidth(3);
        c.setColor("red");
        System.out.println(" ** circle **");
        System.out.println("radius: " + c.getRadius());
        System.out.println("borderwidth of circle: " + c.getBorderwidth());
        System.out.println("color: " + c.getColor());
        System.out.println("area of circle: " + c.area());
        System.out.println("\n");
    }
}
