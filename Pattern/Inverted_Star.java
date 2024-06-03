package in.co.Pattern;

import java.util.Scanner;

public class Inverted_Star {
    public static void main(String[] args) {
//        for (int i=1;i<=4;i++){
//            for(int j= i;j<=4-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
