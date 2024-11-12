package ru.app.devices;

public class Monitor implements Device {
    @Override
    public void display(String shapeName) {
        System.out.println("Displaying " + shapeName + " on monitor.");
    }
}
