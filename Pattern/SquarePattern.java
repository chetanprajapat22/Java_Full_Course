package in.co.Pattern;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int line = scan.nextInt();
        for(int i = 1;i<=line;i++){
            for (int j = 1 ;j<=line;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
