package ru.app.devices;

public class Plotter implements Device {
    @Override
    public void display(String shapeName) {
        System.out.println("Plotting " + shapeName + " on plotter.");
    }
}