package ru.app;

import ru.app.devices.Monitor;
import ru.app.devices.Plotter;
import ru.app.devices.Printer;
import ru.app.shapes.Circle;
import ru.app.shapes.Square;
import ru.app.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Circle circleOnMonitor = new Circle(monitor);
        circleOnMonitor.draw();

        Printer printer = new Printer();
        Square squareOnPrinter = new Square(printer);
        squareOnPrinter.draw();

        Plotter plotter = new Plotter();
        Triangle triangleOnPlotter = new Triangle(plotter);
        triangleOnPlotter.draw();
    }
}
