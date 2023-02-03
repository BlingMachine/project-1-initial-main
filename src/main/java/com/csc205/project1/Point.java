package com.csc205.project1;

public class Point {

    protected double x;
    protected double y;

    public Point() {

        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    public void setPoint(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {

        x += n;
    }

    public void shiftY(double n) {

        y += n;
    }

    public double distance(Point p2) {

        double distance = Math.sqrt(Math.pow((x - p2.x), 2) + Math.pow((y - p2.y), 2));
        return distance;
    }

    public void rotate(double angle) {

        double xx = x;
        x = (xx * Math.cos(angle)) - (y * Math.sin(angle));
        y = (xx * Math.sin(angle)) + (y * Math.cos(angle));
    }

    public String toString() {

        return "Point{x=" + x + ", y=" + y + "}";
    }
}
