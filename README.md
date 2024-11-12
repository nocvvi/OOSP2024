# Фабричный метод (Фабрика)

## Описание задачи
Создайте систему управления геометрическими фигурами (круги, треугольники, прямоугольники). Используйте фабричный метод для создания объектов каждой фигуры.

## Инструкция по выполнению
1. Определите интерфейс для геометрической фигуры.
2. Создайте конкретные классы для различных геометрических фигур (например, Круг, Треугольник, Прямоугольник), которые реализуют этот интерфейс.
3. Создайте фабрику, которая будет возвращать нужный объект фигуры в зависимости от входящего параметра.
4. Напишите клиентский код, который будет использовать фабрику для создания конкретных фигур.

## Пример кода
```java
// Интерфейс для геометрической фигуры
public interface Figure {
    void draw();
}

// Конкретные классы для различных фигур
class Circle implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }
}

class Triangle implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисую треугольник");
    }
}

class Rectangle implements Figure {
    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник");
    }
}

// Фабрика для создания фигур
class FigureFactory {
    public Figure createFigure(String figureType) {
        switch (figureType) {
            case "CIRCLE":
                return new Circle();
            case "TRIANGLE":
                return new Triangle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Неизвестный тип фигуры: " + figureType);
        }
    }

// Клиентский код
public class Client {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();

        Figure circle = factory.createFigure("CIRCLE");
        circle.draw();

        Figure triangle = factory.createFigure("TRIANGLE");
        triangle.draw();

        Figure rectangle = factory.createFigure("RECTANGLE");
        rectangle.draw();
    }
}
