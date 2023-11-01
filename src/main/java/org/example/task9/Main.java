package org.example.task9;

import org.example.task9.model.Ball;
import org.example.task9.model.Basket;
import org.example.task9.service.BallService;
import org.example.task9.service.BasketService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        final Basket basket = new Basket();

        List<Ball> balls = BallService.generate();

        basket.putBalls(balls);

        final BasketService basketService = new BasketService();

        double weight = basketService.weightBalls(balls);
        int number = basketService.numberBlue(balls);

        System.out.printf("Вес шаров в корзине: " + weight);
        System.out.println("\nКоличество синих шаров в корзине: " + number);

    }

}
