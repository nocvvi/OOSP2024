package ru.app.factories.abstractfactory;

import ru.app.components.Engine;
import ru.app.components.Body;
import ru.app.components.Wheel;

public abstract class AbstractFactory {
    public abstract Engine createEngine();
    public abstract Body createBody();
    public abstract Wheel createWheel();
}
