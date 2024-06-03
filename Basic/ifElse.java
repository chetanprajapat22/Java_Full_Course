package in.co.Basic;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
//        int money = 1000000;
        System.out.println("Enter the price " );
        Scanner scan = new Scanner(System.in);
        int money  = scan.nextInt();
//        int price = scan.nextInt();

        if (money>100000 ){
            System.out.println("You can buy the car" );
        }else {
            System.out.println("insufficient Balance");
        }
    }
}
