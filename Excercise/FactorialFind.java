package in.co.Excercise;

import java.util.Scanner;

public class FactorialFind {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any No: ");

        int n = scan.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial NO: " + fact);
    }
}
