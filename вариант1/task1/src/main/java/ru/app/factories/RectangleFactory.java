package ru.app.factories;

import ru.app.shapes.Figure;
import ru.app.shapes.Rectangle;

public class RectangleFactory implements ShapeFactory {
    private double width;
    private double height;

    public RectangleFactory(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Figure createFigure() {
        return new Rectangle(width, height);
    }
}