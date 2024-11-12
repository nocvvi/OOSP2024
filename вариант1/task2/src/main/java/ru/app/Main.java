package ru.app;

import ru.app.factories.abstractfactory.AbstractFactory;
import ru.app.factories.bmw.BmwFactory;
import ru.app.factories.mercedes.MercedesFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory bmwFactory = new BmwFactory();
        assembleCar(bmwFactory);

        AbstractFactory mercedesFactory = new MercedesFactory();
        assembleCar(mercedesFactory);
    }

    private static void assembleCar(AbstractFactory factory) {
        System.out.println("Сборка автомобиля с:");
        System.out.println("\tEngine: " + factory.createEngine().getEngineType());
        System.out.println("\tBody: " + factory.createBody().getBodyType());
        System.out.println("\tWheel: " + factory.createWheel().getWheelSize());
    }
}