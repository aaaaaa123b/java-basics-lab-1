package org.example.task1;

import static java.lang.Math.*;


public class CalculateService {

    public static double calculations(double x, double y) {
        double divisible = 1 + pow(sin(x + y), 2);
        double divider = 2 + abs(x - (2 * x / (1 + pow(x * y, 2))));

        return divisible / divider + x;
    }

}
