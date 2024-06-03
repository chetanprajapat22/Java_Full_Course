package in.co.Excercise;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");

        int n = scan.nextInt();

        if(n%2==0){
            System.out.println("Number is prime: " );
        }else{
            System.out.println("number is not Prime");
        }
    }
}
