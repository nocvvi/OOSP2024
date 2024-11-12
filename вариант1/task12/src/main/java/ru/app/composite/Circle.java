package ru.app.composite;

public class Circle implements GraphicObject {
    private float x, y, radius;

    public Circle(float x, float y, float radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг с центром в (" + x + "," + y + ") и радиусом " + radius);
    }
}