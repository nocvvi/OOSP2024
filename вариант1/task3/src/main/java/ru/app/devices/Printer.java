package ru.app.devices;

public class Printer implements Device {
    @Override
    public void display(String shapeName) {
        System.out.println("Printing " + shapeName + " on printer.");
    }
}