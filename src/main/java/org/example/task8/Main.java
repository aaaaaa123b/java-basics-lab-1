package org.example.task8;

public class Main {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10, 12, 15};

        int[] insertionPoints = InsertionPointsService.findInsertionPoints(a, b);

        for (int i : insertionPoints) {
            System.out.print(i + " ");
        }

    }

}
