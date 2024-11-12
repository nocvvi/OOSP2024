package ru.app.audio;

public class AudioPlayer {
    public void play(String song) {
        System.out.println("Воспроизведение песни: " + song);
    }

    public void stop() {
        System.out.println("Остановка воспроизведения.");
    }

    @Override
    public String toString() {
        return "AudioPlayer{}";
    }
}