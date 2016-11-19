/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Cuong
 */
public class MyPoint {

    private double x;

    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint secondPoint) {
        double kq = Math.sqrt(Math.pow(x - secondPoint.x, 2) + Math.pow(y - secondPoint.y, 2));
        return kq;
    }

    public double distance(MyPoint p1, MyPoint p2) {
        double kq = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(Math.pow(p1.y - p2.y, x), 2));
        return kq;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
