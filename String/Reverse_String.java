package in.co.String;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.next();

        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
}
