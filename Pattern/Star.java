package in.co.Pattern;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
//        for(int i = 1 ;i<=4;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows the star pattern: ");
        int n = scan.nextInt();
//        int j = scan.nextInt();
        for (int i=1 ;i<=n ; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
