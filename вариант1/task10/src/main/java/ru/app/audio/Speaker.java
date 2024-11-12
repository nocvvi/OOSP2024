package ru.app.audio;

public class Speaker {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Громкость установлена на " + volume + ".");
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Speaker{volume=" + volume + '}';
    }
}