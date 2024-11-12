package ru.app.shapes;

import ru.app.devices.Device;

public class Circle extends Shape {
    public Circle(Device device) {
        super(device);
    }

    @Override
    public void draw() {
        device.display("Circle");
    }
}