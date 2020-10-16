package ru.mirea.gibo0318.lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Pink", 5);
        Ball b2 = new Ball("Blue", 3);
        Ball b3 = new Ball("Black");
        b3.setRadius(10);
        System.out.println(b1);
        b1.Volume();
        b2.Volume();
        b3.Volume();
    }
}
