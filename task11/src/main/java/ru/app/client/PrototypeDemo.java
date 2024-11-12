package ru.app.client;

import ru.app.prototype.Circle;
import ru.app.prototype.Rectangle;
import ru.app.prototype.Shape;

import java.util.Hashtable;

public class PrototypeDemo {
    public static void main(String[] args) {
        Hashtable<String, Shape> shapeMap = loadCache();

        Shape clonedShape = (Shape) shapeMap.get("1").clone();
        Shape clonedShape1 = (Shape) shapeMap.get("2").clone();
        System.out.println("Клон фигуры: ");
        System.out.println(clonedShape);
        System.out.println(clonedShape1);

        clonedShape.draw();
    }

    private static Hashtable<String, Shape> loadCache() {
        Hashtable<String, Shape> shapeMap = new Hashtable<>();
        Circle circle = new Circle();
        circle.setId("1");
        circle.setRadius(10);
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        rectangle.setWidth(20);
        rectangle.setHeight(30);
        shapeMap.put(rectangle.getId(), rectangle);

        return shapeMap;
    }
}