package ru.app.shapes;

import ru.app.devices.Device;

public class Triangle extends Shape {
    public Triangle(Device device) {
        super(device);
    }

    @Override
    public void draw() {
        device.display("Triangle");
    }
}
