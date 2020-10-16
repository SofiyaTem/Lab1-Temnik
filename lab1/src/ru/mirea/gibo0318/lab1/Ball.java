package ru.mirea.gibo0318.lab1;
import java.lang.*;

public class Ball {
private String color;
private int radius;

public Ball(String a, int n) {
    color = a;
    radius = n;
}
public Ball(String a) {
    color = a;
    radius = 0;
}
public Ball() {
    color = "Red";
    radius = 2;
}

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        return this.color + " ball radius = " + this.radius;
    }

    public void Volume () {
    System.out.println("The volume of this" + color + "ball is " + (4.0/3.0) * Math.PI * radius*radius*radius);
    }
}
