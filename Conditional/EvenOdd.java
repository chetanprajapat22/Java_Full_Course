package in.co.Conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = scan.nextInt();

//        int n =15;
        if(n%2==0){
            System.out.println("Even Number: ");
        }else {
            System.out.println("Odd Number: ");
        }
    }
}
