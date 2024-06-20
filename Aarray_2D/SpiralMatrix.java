package in.co.Aarray_2D;

public class SpiralMatrix {
    public static void printspiral(int matrix[][]){
        int startRow = 0;
        int startcol= 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startcol<=endCol){
//          top
            for (int j=startcol;j<=endCol;j++){
                System.out.print(matrix[startRow] [j] +" ");
            }
//            right
            for (int i=startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
//            bottom
            for (int j=endCol-1;j>=startcol;j--){
                if (startcol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
//            left
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startcol==endCol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printspiral(matrix);
    }
}
