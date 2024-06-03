package in.co.operators;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.of addition");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = a+b;
        System.out.println("Sum of two No: "  + c);
    }
}
