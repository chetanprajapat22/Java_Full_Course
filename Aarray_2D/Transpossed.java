package in.co.Aarray_2D;

public class Transpossed {
    public static void main(String[] args) {
        int row =2;
        int coloumn= 3;
        int matrix[][] = {{2,3,7},{5,6,7}};

        printMatrix(matrix);

        int [][] transpose = new int[coloumn][row];

        for (int i=0;i<row;i++){
            for (int j=0;j<coloumn;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("the matrix is: ");

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
