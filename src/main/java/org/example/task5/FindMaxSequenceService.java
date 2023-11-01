package org.example.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxSequenceService {

    public static int maxLength(int[] numbers) {
        int n = numbers.length;
        List<Integer> list = new ArrayList<>();
        list.add(numbers[0]);

        for (int i = 1; i < n; i++) {
            if (numbers[i] > list.get(list.size() - 1)) {
                list.add(numbers[i]);
            } else {
                int low = Collections.binarySearch(list, numbers[i]);
                if (low < 0) {
                    low = -(low + 1);
                }
                list.set(low, numbers[i]);
            }
        }
        return n - list.size();
    }

}

