package ru.app.composite;

public class Triangle implements GraphicObject {
    private float x1, y1, x2, y2, x3, y3;

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник с вершинами в (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ")");
    }
}