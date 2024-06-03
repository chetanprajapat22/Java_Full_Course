package in.co.Conditional;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }else {


        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if (isPrime ==true){
            System.out.println("number is Prime");
        }else {
            System.out.println("number is not prime");
        }
        }
    }
}
