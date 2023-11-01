package org.example.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();

        System.out.println("Введите y:");
        double y = scanner.nextDouble();

        boolean result = ShadedAreaService.check(x, y);
        System.out.println(result);
    }
}
