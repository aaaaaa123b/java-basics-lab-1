package org.example.task9.service;

import org.example.task9.model.Ball;
import org.example.task9.model.BallColor;

import java.util.ArrayList;
import java.util.List;

public class BallService {

    public static List<Ball> generate() {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(2, BallColor.RED));
        balls.add(new Ball(1.1, BallColor.BLUE));
        balls.add(new Ball(3.3, BallColor.YELLOW));
        balls.add(new Ball(2, BallColor.RED));
        balls.add(new Ball(1.1, BallColor.BLUE));
        balls.add(new Ball(3.3, BallColor.YELLOW));
        return balls;
    }
}
