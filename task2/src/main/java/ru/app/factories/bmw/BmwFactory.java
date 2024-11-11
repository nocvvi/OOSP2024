package ru.app.factories.bmw;

import ru.app.components.Engine;
import ru.app.components.Body;
import ru.app.components.Wheel;
import ru.app.factories.abstractfactory.AbstractFactory;

public class BmwFactory extends AbstractFactory {
    @Override
    public Engine createEngine() {
        return new BmwEngine();
    }

    @Override
    public Body createBody() {
        return new BmwBody();
    }

    @Override
    public Wheel createWheel() {
        return new BmwWheel();
    }

    private static class BmwEngine implements Engine {
        @Override
        public String getEngineType() {
            return "BMW Engine V8 M TwinPower Turbo";
        }
    }

    private static class BmwBody implements Body {
        @Override
        public String getBodyType() {
            return "BMW Body crossover";
        }
    }

    private static class BmwWheel implements Wheel {
        @Override
        public String getWheelSize() {
            return "BMW Wheel Size 295/35/R21";
        }
    }
}