package main;

public class Main {
    public static final double ACCELERATION = 9.81;
    public double shotDistance(double speed, double angle){
        return ((speed * speed) / ACCELERATION) * Math.sin(Math.toRadians(2 * angle));
    }

}
