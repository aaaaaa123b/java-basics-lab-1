package org.example.task6;

import java.util.Random;

import static org.example.task6.SquareMatrixService.createMatrix;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        double[] inputArray = randomizeArray(n);

        double[][] squareMatrix = createMatrix(inputArray);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(squareMatrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static double[] randomizeArray(int n){
        double[] inputArray = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            inputArray[i] = random.nextInt(99);
        }
        return inputArray;
    }
}
