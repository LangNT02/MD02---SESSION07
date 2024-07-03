package RA.homework;

public class Shape {
    private String color;

    public Shape() {
        this.color = "unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Shape[color=" + color + "]";
    }
}
