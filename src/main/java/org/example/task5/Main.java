package org.example.task5;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int n = 10;
        int[] input = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            input[i] = random.nextInt(100);
            System.out.print(input[i] + " ");
        }

        int K = FindMaxSequenceService.maxLength(input);

        System.out.println("\nНаименьшее число K элементов, которые можно выкинуть из данной\n" +
                "последовательности, так чтобы осталась возрастающая подпоследовательность:" + K);
    }

}
