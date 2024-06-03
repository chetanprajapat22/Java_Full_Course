package in.co.Excercise;

import in.co.Basic.WhileLoop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number: ");

        int n = scan.nextInt();
        int s= 0 ;
        int r =0 ;
        int temp =n;
        while (n!=0){
            r= n%10;
            s = s+(r*r*r);
            n= n/10;
        }
        if (temp == s) {
            System.out.println("no is armstrong");
        } else {
            System.out.println("no is not armstrong");
        }
    }
}
