package org.example.task8;

import java.util.ArrayList;

public class InsertionPointsService {

    public static int[] findInsertionPoints(int[] a, int[] b) {
        ArrayList<Integer> temp = new ArrayList<>();
        int[] indexes = new int[b.length];
        for (int k : a) {
            temp.add(k);
        }
        int i = 0, j = 0;
        while (i < temp.size() && j < b.length) {
            if (b[j] <= temp.get(i)) {
                temp.add(i, b[j]);
                indexes[j] = i;
                j++;
            }
            i++;
        }
        while (j < b.length) {
            indexes[j] = i++;
            j++;
        }
        return indexes;
    }

}
