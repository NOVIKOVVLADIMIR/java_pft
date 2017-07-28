package ru.stqa.pft.sandbox;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double dist(double x2, double y2) {
       double x0 = x2 - this.x;
       double y0 = y2 - this.y;
       return Math.sqrt(Math.pow(x0, 2) + Math.pow(y0, 2));
    }
    public double distance(Point p) {
             return dist(p.x, p.y);
}
}

