package com.point;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(5, 7);
        Point point1 = new Point(6, 9);

        System.out.println("odległość point1 od (0, 0) " + point.distance());
        System.out.println("odległość point1 do point2:  " + point.distance(point1));
        System.out.println("odległość point1 od  (6, 9): "  + point.distance(6, 9));

    }
}