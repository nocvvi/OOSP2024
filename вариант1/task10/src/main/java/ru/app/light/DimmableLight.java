package ru.app.light;

public class DimmableLight {
    private boolean isOn;
    private int brightness;

    public void turnOn() {
        isOn = true;
        System.out.println("Свет включен.");
    }

    public void turnOff() {
        isOn = false;
        brightness = 0;
        System.out.println("Свет выключен.");
    }

    public void setBrightness(int brightness) {
        if (!isOn) {
            System.out.println("Сначала включите свет.");
            return;
        }
        this.brightness = brightness;
        System.out.println("Яркость света установлена на " + brightness + ".");
    }

    @Override
    public String toString() {
        return "DimmableLight{" +
                "isOn=" + isOn +
                ", brightness=" + brightness +
                '}';
    }
}