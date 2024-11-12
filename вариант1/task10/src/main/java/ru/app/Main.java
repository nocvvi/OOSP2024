package ru.app;

import ru.app.facade.HomeFacade;
import ru.app.light.DimmableLight;
import ru.app.light.RGBLight;
import ru.app.temperature.Thermostat;
import ru.app.audio.AudioPlayer;
import ru.app.audio.Speaker;

public class Main {
    public static void main(String[] args) {
        DimmableLight dimmableLight = new DimmableLight();
        RGBLight rgbLight = new RGBLight();
        Thermostat thermostat = new Thermostat();
        AudioPlayer audioPlayer = new AudioPlayer();
        Speaker speaker = new Speaker();

        HomeFacade homeFacade = new HomeFacade(dimmableLight, rgbLight, thermostat, audioPlayer, speaker);

        homeFacade.turnOnLights();
        homeFacade.changeRGBColor("red");
        homeFacade.setTemperature(24);
        homeFacade.playMusic("Shape of you");
        homeFacade.setSpeakerVolume(20);
        homeFacade.changeRGBColor("blue");
        homeFacade.playMusic("TSM");
        homeFacade.setSpeakerVolume(27);


        homeFacade.stopMusic();
        homeFacade.turnOffLights();
    }
}