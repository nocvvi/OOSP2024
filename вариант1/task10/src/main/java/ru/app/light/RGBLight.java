package ru.app.light;

public class RGBLight extends Light {
    private String color;

    public void changeColor(String color) {
        if (!isOn) {
            System.out.println("Сначала включите свет.");
            return;
        }
        this.color = color;
        System.out.println("Цвет установлен на " + color + '.');
    }

    @Override
    public String toString() {
        return super.toString() + ", color='" + color + "'}";
    }
}