package ru.app.facade;

import ru.app.light.DimmableLight;
import ru.app.light.RGBLight;
import ru.app.temperature.Thermostat;
import ru.app.audio.AudioPlayer;
import ru.app.audio.Speaker;

public class HomeFacade {
    private DimmableLight dimmableLight;
    private RGBLight rgbLight;
    private Thermostat thermostat;
    private AudioPlayer audioPlayer;
    private Speaker speaker;

    public HomeFacade(DimmableLight dimmableLight, RGBLight rgbLight,
                      Thermostat thermostat, AudioPlayer audioPlayer, Speaker speaker) {
        this.dimmableLight = dimmableLight;
        this.rgbLight = rgbLight;
        this.thermostat = thermostat;
        this.audioPlayer = audioPlayer;
        this.speaker = speaker;
    }

    public void turnOnLights() {
        dimmableLight.turnOn();
        rgbLight.turnOn();
    }

    public void turnOffLights() {
        dimmableLight.turnOff();
        rgbLight.turnOff();
    }

    public void changeRGBColor(String color) {
        rgbLight.changeColor(color);
    }

    public void setTemperature(int temperature) {
        thermostat.setTemperature(temperature);
    }

    public void playMusic(String song) {
        audioPlayer.play(song);
    }

    public void stopMusic() {
        audioPlayer.stop();
    }

    public void setSpeakerVolume(int volume) {
        speaker.setVolume(volume);
    }
}