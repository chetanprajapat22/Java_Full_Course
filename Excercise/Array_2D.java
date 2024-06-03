package in.co.Excercise;

public class Array_2D {
    public static void main(String[] args) {
        int rows= 9;
        int columns = 11;

        int [][] arr = new int[rows][columns];

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j]=(i+1)*(j);
            }
        }
        for (int i=0;i<rows;i++){
            System.out.println("Muttiplication table of: " + (i+1) + " :"  );

        for (int j=1;j<columns;j++) {
            System.out.println((i + 1) + " * " + (j ) + " = " + arr[i][j]);
        }
            System.out.println(" ");
        }
    }
}
//import java.util.Scanner;
//
//public class Multiples {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the integer N from the input
//        int N = scanner.nextInt();
//
//        // Ensure that N is within the specified constraints
//        if (N < 2 || N > 20) {
//            System.out.println("N must be between 2 and 20.");
//            return;
//        }
//
//        // Loop to print the first 10 multiples of N
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(N + " x " + i + " = " + (N * i));
//        }
//
//        scanner.close();
//    }
//}
//
