package in.co.Conditional;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int sum = 0;
        int i =1;
        while (i<=num){
            sum += i;
            i++;
        }
        System.out.println("sum is: " + sum);
    }
}
