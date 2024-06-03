package in.co.Threads;

import java.util.Scanner;

public class calc implements Runnable{

    public void run(){
        System.out.println("calculation task started");

        Scanner sc =new Scanner(System.in);
        System.out.println("please enter first number");

        int num1 = sc.nextInt();
        System.out.println("please enter second number");
        int num2 = sc.nextInt();

        int res = num1+num2;

        System.out.println(res);
        System.out.println("*************************************");


    }
}
