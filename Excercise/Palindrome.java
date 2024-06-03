package in.co.Excercise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number:");

        int n = scan.nextInt();
        int  s=0;
        int temp=0;
        int r=0;
           temp=n;
        while (n!=0){
            r= n%10;
            s= (s*10)+r;
            n= n/10;
        }
        if (temp==s){
            System.out.println("No is Palindrome: ");
        }else {
            System.out.println("N0 is not Palindrome: ");
        }
    }
}
