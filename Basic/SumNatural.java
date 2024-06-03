package in.co.Basic;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int limit = scan.nextInt();
        int sum =0;
        for(int i=1;i<=limit;i++){
            sum += i;
        }
        System.out.println("the sum of natural number up to " + limit + " is:" + sum);
         scan.close();
    }
}
