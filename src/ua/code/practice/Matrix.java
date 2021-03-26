package ua.code.practice;

public class Matrix {

    public static void main(String[] args) {
//        int[][] matrix = new int[3][4];
        int[][] matrix = new int[][]{{1, 2, 3, -1},
                {4, 5, 6},
                {7, 8, 9, 3, 4}};

//        fillMatrix(matrix);

        int[] rowSum = SumOfElementsInRows(matrix);

        System.out.println(rowSum[0]);
        System.out.println(rowSum[1]);
        System.out.println(rowSum[2]);

        printMatrix(matrix);
    }

    private static int[] SumOfElementsInRows(int[][] matrix) {
        int[] rowSum = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            rowSum[i] = sum;
        }
        return rowSum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + "\t");
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = i * 10 + j;
        }
    }
}
