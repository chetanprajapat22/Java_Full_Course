package in.co.Threads;

import java.util.Scanner;

public class LaunchMulti {

    public static void main(String[] args) {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter First number");
        int num1 = sc.nextInt();

        System.out.println("please enter Second number");
        int num2 = sc.nextInt();

        int res = num1+num2;
        System.out.println(res);

        System.out.println("Calculation task ended");

        System.out.println("******************************************");
  

        System.out.println("Printing * Task Started");

        for (int i=0;i<4;i++){
            System.out.println("*");
        }
        System.out.println("Printing * Task Ended");
        System.out.println("********************************************");

        System.out.println("Displaying important message task");
        for (int i=0;i<3;i++){
            System.out.println("focus on your important skills");
        }
        System.out.println("Displaying important task ended");
    }
}
