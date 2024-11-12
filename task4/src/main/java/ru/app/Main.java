package ru.app;

import ru.app.adapters.Adapter;
import ru.app.adapters.LegacyAdapter;
import ru.app.devices.OldDevice;
import ru.app.devices.SmartPlug;

public class Main {
    public static void main(String[] args) {
        OldDevice oldDevice = new OldDevice();
        SmartPlug smartPlug = new LegacyAdapter(oldDevice);

        smartPlug.turnOn();
        smartPlug.turnOff();
    }
}