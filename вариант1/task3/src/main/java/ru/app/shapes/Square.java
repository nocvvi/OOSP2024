package ru.app.shapes;

import ru.app.devices.Device;

public class Square extends Shape {
    public Square(Device device) {
        super(device);
    }

    @Override
    public void draw() {
        device.display("Square");
    }
}