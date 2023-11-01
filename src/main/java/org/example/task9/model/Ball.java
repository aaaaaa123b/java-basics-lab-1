package org.example.task9.model;


public class Ball {

    private double weight;
    private BallColor color;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BallColor getColor() {
        return color;
    }

    public void setColor(BallColor color) {
        this.color = color;
    }

    public Ball(double weight, BallColor color) {
        this.weight = weight;
        this.color = color;
    }
}
