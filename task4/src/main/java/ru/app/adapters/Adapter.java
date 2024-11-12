package ru.app.adapters;

import ru.app.devices.SmartPlug;
import ru.app.devices.OldDevice;

public class Adapter implements SmartPlug {
    private final OldDevice oldDevice;

    public Adapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void turnOn() {
        oldDevice.start();
    }

    @Override
    public void turnOff() {
        oldDevice.stop();
    }
}