package ru.app.light;

public abstract class Light {
    protected boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println(getClass().getSimpleName() + " включен.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " выключен.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{isOn=" + isOn + '}';
    }
}