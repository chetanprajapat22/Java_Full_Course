package in.co.Conditional;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
//        int n = 12804;
//        while (n>0) {
//            int lastDigit = n%10;
//            System.out.print (lastDigit + " ");
//            n= n/10;
//        }
//        System.out.println();
//    }
//
//        int n = 10899;
//        int rev = 0;
//        while(n>0){
//            int lastDigit = n%10;
//            rev = (rev*10) + lastDigit;
//            n = n/10;
//        }
//        System.out.println(rev);
//        int n = 2325432;
//
//        while(n>0){
//            int lastDigit = n%10;
//            System.out.print(lastDigit + " ");
//            n = n/10;
//        }
//        System.out.println("");

//     Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number");
//     int n = scan.nextInt();
//     while(n>0){
//         int lastDigit = n%10;
//         System.out.print(lastDigit+ " ");
//         n = n/10;
//     }
        int n =183943;
        int rev = 0;
        while (n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
