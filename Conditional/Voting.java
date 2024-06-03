package in.co.Conditional;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(
                System.in
        );
        System.out.println("enter your age");
        int num = scan.nextInt();
        if(num>=18){
            System.out.println("you can vote1");
        }else{
            System.out.println("you can't vote");
        }
    }
}
