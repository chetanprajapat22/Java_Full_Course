package in.co.Basic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter a number to check if its prime:");
//        int number = scan.nextInt();
//        boolean isPrime = true;
//        if(number<=1){
//            isPrime = false;
//        }else {
//            for(int i=2;i<=Math.sqrt(number);i++){
//                if(number%i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        if (isPrime){
//            System.out.println(number + " is a prime number");
//        }else {
//            System.out.println(number + " is not a prime number");
//        }
//        scan.close();
        int number = 19;
        boolean isPrime = true;
        if(number<=1){
            isPrime = false;
        }else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(number+" is a prime number");
        }else {
            System.out.println(number + " is nota prime  number");
        }
    }
}
