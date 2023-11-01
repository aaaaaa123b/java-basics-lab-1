package org.example.task9.service;

import org.example.task9.model.Ball;
import org.example.task9.model.BallColor;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasketService {

    public double weightBalls(List<Ball> balls) {
        double weight = 0;
        for (Ball ball : balls) {
            weight = weight + ball.getWeight();
        }
        return weight;
    }

    public int numberBlue(List<Ball> balls) {
        int counter = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == BallColor.BLUE)
                counter++;
        }
        return counter;
    }

    public void sortBallsByWeight(List<Ball> balls) {
        balls.sort(Comparator.comparing(Ball::getWeight));
    }


}
