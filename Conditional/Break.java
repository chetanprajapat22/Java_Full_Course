package in.co.Conditional;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
//        for (int i= 1; i<5 ; ++i){
//            if(i==3){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("i am out of the loop");
        Scanner scanner =new Scanner(System.in);
        do{
            System.out.print("enter your number");
        int n = scanner.nextInt();
        if(n%10 == 0){
            break;
        }
            System.out.println(n);
        }while (true);
    }
}
