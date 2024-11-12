package ru.app.factories;

import ru.app.shapes.Circle;
import ru.app.shapes.Figure;

public class CircleFactory implements ShapeFactory {
    private double radius;

    public CircleFactory(double radius) {
        this.radius = radius;
    }

    @Override
    public Figure createFigure() {
        return new Circle(radius);
    }
}