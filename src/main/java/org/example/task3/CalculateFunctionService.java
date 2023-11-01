package org.example.task3;

import java.util.LinkedHashMap;

public class CalculateFunctionService {

    public static LinkedHashMap<Double, Double> createTable(double a, double b, double h) {
        LinkedHashMap<Double, Double> table = new LinkedHashMap<>();

        for (double x = a; x <= (b + 0.001); x += h) {
            table.put(x, Math.tan(x));
        }
        return table;
    }

}
