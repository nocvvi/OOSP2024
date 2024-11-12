package ru.app;

import ru.app.composite.CompositeGraphic;
import ru.app.composite.Circle;
import ru.app.composite.Square;
import ru.app.composite.Triangle;

public class Main {
    public static void main(String[] args) {
        CompositeGraphic composite = new CompositeGraphic();

        composite.add(new Circle(1, 2, 3));
        composite.add(new Square(5, 7, 8));
        composite.add(new Triangle(9, 11, 13, 15, 17, 19));

        CompositeGraphic subComposite = new CompositeGraphic();
        subComposite.add(new Triangle(21, 23, 25, 27, 29, 31));
        subComposite.add(new Circle(33, 35, 37));

        composite.add(subComposite);

        composite.draw();
    }
}