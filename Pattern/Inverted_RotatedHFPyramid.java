package in.co.Pattern;

import java.util.Scanner;

public class Inverted_RotatedHFPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");

        int n= scan.nextInt();
//        int r = scan.nextInt();
//outer loop
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
