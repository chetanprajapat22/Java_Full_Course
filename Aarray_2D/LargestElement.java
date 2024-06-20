package in.co.Aarray_2D;

import java.util.Scanner;

public class LargestElement {

    public static int largestcell(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                 if (largest <matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
        }
        int largest = largestcell(matrix);
        System.out.print("the largest element in the 2d array is: " + largest);
    }
}
