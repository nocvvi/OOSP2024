package ru.app.composite;

public class Square implements GraphicObject {
    private float x, y, sideLength;

    public Square(float x, float y, float sideLength) {
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем квадрат с левым верхним углом в (" + x + "," + y + ") и длиной стороны " + sideLength);
    }
}