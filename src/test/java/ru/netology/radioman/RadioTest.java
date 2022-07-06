package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioNomber(){
        Radio number = new Radio();

        number.setCurrentRadioStation(7);

        int expected = 7;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void radioNomberMax(){
        Radio number = new Radio();

        number.setCurrentRadioStationMax();

        int expected = 9;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected , actual);

    }
    @Test
    public void notRadioNumber(){
        Radio number = new Radio();

        number.setCurrentRadioStation(10);

        int expected = 0;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notRadioNumberMinus(){
        Radio number = new Radio();

        number.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioNumber(){
        Radio number = new Radio();

        number.setCurrentRadioStation(4);
        number.next();

        int expected = 5;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void nextRadioNumberMax(){
        Radio number = new Radio();

        number.setCurrentRadioStation(9);
        number.next();

        int expected = 0;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void prevRadioNumber(){
        Radio number = new Radio();

        number.setCurrentRadioStation(8);
        number.prev();

        int expected = 7;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void prevRadioNumberMin(){
        Radio number = new Radio();

        number.setCurrentRadioStation(0);
        number.prev();

        int expected = 9;
        int actual = number.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void soundVolume() {
        Radio sound = new Radio();

        sound.setSoundVolume(7);

        int expected = 7;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void soundVolumeMax() {
        Radio sound = new Radio();

        sound.setSoundVolume(10);

        int expected = 10;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void soundVolumeOverMax() {
        Radio sound = new Radio();

        sound.setSoundVolume(15);

        int expected = 0;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void soundVolumeOverMin(){
        Radio sound = new Radio();

        sound.setSoundVolume(-1);

        int expected = 0;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void increaseVolume(){

        Radio sound = new Radio();

        sound.setSoundVolume(8);
        sound.increaseVolume();

        int expected = 9;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void increaseVolume10(){

        Radio sound = new Radio();

        sound.setSoundVolume(10);
        sound.increaseVolume();

        int expected = 10;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void reductionVolume(){
        Radio sound = new Radio();

        sound.setSoundVolume(8);
        sound.reductionVolume();

        int expected = 7;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void reductionVolumeNull(){
        Radio sound = new Radio();

        sound.setSoundVolume(0);
        sound.reductionVolume();

        int expected = 0;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void soundMax(){
        Radio sound = new Radio();

        sound.setSoundVolumeMax();

        int expected = 10;
        int actual = sound.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


}
