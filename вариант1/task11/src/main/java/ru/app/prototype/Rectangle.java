package ru.app.prototype;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Рисуем прямоугольник с шириной: " + width + " и высотой: " + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id='" + id + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}