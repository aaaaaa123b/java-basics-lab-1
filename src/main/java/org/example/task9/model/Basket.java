package org.example.task9.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Ball> balls = new ArrayList<>();

    public void putBalls(List<Ball> balls) {
        this.balls.addAll(balls);
    }

    public List<Ball> getBalls() {
        return balls;
    }


}
