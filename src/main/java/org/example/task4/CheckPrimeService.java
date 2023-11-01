package org.example.task4;

import java.util.ArrayList;
import java.util.List;

public class CheckPrimeService {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    public static List<Integer> indexexOfPrimeNumbers(int N, int[] array) {
        List<Integer> primeIndexes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            boolean result = CheckPrimeService.isPrime(array[i]);
            if (result) {
                primeIndexes.add(i);
            }
        }
        return primeIndexes;
    }
}
