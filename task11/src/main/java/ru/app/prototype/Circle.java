package ru.app.prototype;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с радиусом: " + radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id='" + id + '\'' +
                ", radius=" + radius +
                '}';
    }
}