package org.example.task3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a");
        double a = scanner.nextDouble();

        System.out.println("Введите b");
        double b = scanner.nextDouble();

        System.out.println("Введите h");
        double h = scanner.nextDouble();

        LinkedHashMap<Double, Double> result = CalculateFunctionService.createTable(a, b, h);

        for (Map.Entry<Double, Double> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "       " + entry.getValue());
        }
    }
}
