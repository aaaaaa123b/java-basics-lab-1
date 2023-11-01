package org.example.task2;


public class ShadedAreaService {

    public static boolean check(double x, double y) {
        return (x <= 6 && x >= -6 && y >= -3 && y <= 0) || (x <= 4 && x >= -4 && y >= 0 && y <= 4);
    }

}
