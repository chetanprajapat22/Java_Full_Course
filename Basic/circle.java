package in.co.Basic;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println(area);
    }
}
