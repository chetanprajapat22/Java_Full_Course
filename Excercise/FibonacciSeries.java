package in.co.Excercise;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter term: ");
//        int n =  scan.nextInt();
//        int a= 0;
//        int b= 1;
//        System.out.println("Fibonacci series up to " + n + "terms: ");
//
//        System.out.println(a+ " " + b);
//        for (int i=2;i<=n ; i++){
//            int c= a+b;
//            System.out.print(" " + c) ;
//            a=b;
//            b=c;
//        }
        int term = scan.nextInt();
        int a=0;
        int b= 1;
        int c;
        for (int i=1;i<=term;i++){
            c= a+b;
            a=b;
            b=c;
            System.out.print( " " + a);
        }

    }
}
