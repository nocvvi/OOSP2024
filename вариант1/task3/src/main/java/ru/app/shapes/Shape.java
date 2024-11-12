package ru.app.shapes;

import ru.app.devices.Device;

public abstract class Shape {
    protected Device device;

    public Shape(Device device) {
        this.device = device;
    }

    public abstract void draw();
}