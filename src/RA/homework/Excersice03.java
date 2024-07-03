package RA.homework;

import java.util.Scanner;

public class Excersice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();

        System.out.println("Nhập độ dài cạnh thứ hai: ");
        double side2 = scanner.nextDouble();

        System.out.println("Nhập độ dài cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        System.out.println("Nhập màu ắc của tam giác: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Thông tin của tam giác:");
        System.out.println(triangle);
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Chu vi: " + triangle.getPerimeter());

        scanner.close();
    }
}
