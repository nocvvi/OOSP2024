package ru.app.factories;

import ru.app.shapes.Figure;
import ru.app.shapes.Triangle;

public class TriangleFactory implements ShapeFactory {
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleFactory(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Figure createFigure() {
        return new Triangle(sideA, sideB, sideC);
    }
}