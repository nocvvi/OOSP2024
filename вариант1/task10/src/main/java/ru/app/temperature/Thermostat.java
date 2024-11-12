package ru.app.temperature;

public class Thermostat {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Температура установлена на " + temperature + " градусов.");
    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "temperature=" + temperature +
                '}';
    }
}