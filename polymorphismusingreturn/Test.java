package in.co.polymorphismusingreturn;

public class Test {
    public static void main(String[] args) {
        shape s1 = shape.getshape(1);
        shape s2 = shape.getshape(2);
        shape s3 = shape.getshape(3);
        System.out.println("area of rectangle = "+ s1.area());
        System.out.println("area of circle = " +s2.area());
        System.out.println("area of triangle = "+ s3.area());
    }
}
