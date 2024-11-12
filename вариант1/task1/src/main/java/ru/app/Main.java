package ru.app;

import ru.app.factories.CircleFactory;
import ru.app.factories.RectangleFactory;
import ru.app.factories.ShapeFactory;
import ru.app.factories.TriangleFactory;
import ru.app.shapes.Figure;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите фигуру для создания:");
            System.out.println("1. Круг");
            System.out.println("2. Треугольник");
            System.out.println("3. Прямоугольник");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    ShapeFactory circleFactory = new CircleFactory(radius);
                    Figure circle = circleFactory.createFigure();
                    circle.draw();
                    System.out.println("Площадь круга: " + circle.calculateArea());
                    break;
                case 2:
                    System.out.print("Введите стороны треугольника (a b c): ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    ShapeFactory triangleFactory = new TriangleFactory(a, b, c);
                    Figure triangle = triangleFactory.createFigure();
                    triangle.draw();
                    System.out.println("Площадь треугольника: " + triangle.calculateArea());
                    break;
                case 3:
                    System.out.print("Введите ширину и высоту прямоугольника (w h): ");
                    double w = scanner.nextDouble();
                    double h = scanner.nextDouble();
                    ShapeFactory rectangleFactory = new RectangleFactory(w, h);
                    Figure rectangle = rectangleFactory.createFigure();
                    rectangle.draw();
                    System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        }

        scanner.close();
    }
}