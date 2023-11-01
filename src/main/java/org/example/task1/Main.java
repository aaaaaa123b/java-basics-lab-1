package org.example.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();

        System.out.println("Введите y:");
        double y = scanner.nextDouble();

        double result = CalculateService.calculations(x, y);
        System.out.println("Результат вычисления:" + result);
    }
}
