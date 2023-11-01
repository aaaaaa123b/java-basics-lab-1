package org.example.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = 10;

        int[] array = randomizeArray(N);

        List<Integer> primeIndexes;

        primeIndexes = CheckPrimeService.indexexOfPrimeNumbers(N, array);

        if (primeIndexes.isEmpty() ) System.out.println("Нет простых чисел");
        else {
            System.out.println();
            System.out.println("индексы простых чисел:" + primeIndexes);
        }
    }

    public static int[] randomizeArray(int N) {
        int[] array = new int[N];

        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }
        return array;
    }
}