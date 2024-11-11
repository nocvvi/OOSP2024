package ru.app.factories.mercedes;

import ru.app.components.Engine;
import ru.app.components.Body;
import ru.app.components.Wheel;
import ru.app.factories.abstractfactory.AbstractFactory;

public class MercedesFactory extends AbstractFactory {
    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public Body createBody() {
        return new MercedesBody();
    }

    @Override
    public Wheel createWheel() {
        return new MercedesWheel();
    }

    private static class MercedesEngine implements Engine {
        @Override
        public String getEngineType() {
            return "Mercedes Engine v8 biturbo";
        }
    }

    private static class MercedesBody implements Body {
        @Override
        public String getBodyType() {
            return "Mercedes body coupe";
        }
    }

    private static class MercedesWheel implements Wheel {
        @Override
        public String getWheelSize() {
            return "Mercedes Wheel Size 255/55/R19";
        }
    }
}