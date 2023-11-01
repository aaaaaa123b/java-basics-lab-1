package org.example.task6;

public class SquareMatrixService {

    public static double[][] createMatrix(double[] inputArray) {
        int n = inputArray.length;
        double[][] squareMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squareMatrix[i][j] = inputArray[(i + j) % n];
            }
        }
        return squareMatrix;

    }
}
