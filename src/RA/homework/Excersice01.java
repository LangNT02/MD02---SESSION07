package RA.homework;

public class Excersice01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.0,5.0,"green");
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
