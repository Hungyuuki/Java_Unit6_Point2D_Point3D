package com.company;

public class Main {

    public static void main(String[] args) {
//        test point 2D
	Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3, 2);
        System.out.println(point2D);

        point2D.setX(5);
        System.out.println(point2D);

        point2D.setXY(5, 10);
        System.out.println(point2D);

//        test point 3D
        Point3D point3D = new Point3D();
        point3D.setXY(4, 5);
        point3D.setZ(7);
        System.out.println(point3D);
    }
}
