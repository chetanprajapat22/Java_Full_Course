package in.co.Interface;

public class main {
    public static void main(String[] args) {
        shape r = new rectangle(2,3);
        System.out.println("area of rectangle: " + r.area());
        shape c = new circle(2);
        System.out.println("area of circle: " + c.area());
    }
}
