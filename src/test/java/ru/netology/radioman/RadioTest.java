package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio nomber = new Radio();
    Radio nomber2 = new Radio(10);
    Radio sound = new Radio();

    @Test
    public void radioNomber() {
        nomber.setCurrentRadioStation(7);
        Assertions.assertEquals(7, nomber.getCurrentRadioStation());
    }

    @Test

    public void radioNomberMaxMin() {
        Assertions.assertEquals(9, nomber.getMaxCurrentRadioStation());
        Assertions.assertEquals(0, nomber.getMinCurrentRadioStation());


    }

    @Test
    public void notRadioNomber() {
        nomber.setCurrentRadioStation(10);
        Assertions.assertEquals(0, nomber.getCurrentRadioStation());
    }

    @Test
    public void notRadioNomberMinus() {
        nomber.setCurrentRadioStation(-1);
        Assertions.assertEquals(0, nomber.getCurrentRadioStation());
    }

    @Test

    public void nextRadioNomberMax() {

        nomber2.setCurrentRadioStation(9);
        nomber2.next();

        Assertions.assertEquals(0, nomber2.getCurrentRadioStation());

    }

    @Test

    public void nextRadioNomber() {

        nomber.setCurrentRadioStation(4);
        nomber.next();

        Assertions.assertEquals(5, nomber.getCurrentRadioStation());

    }

    @Test

    public void prevRadioNomber() {

        nomber.setCurrentRadioStation(8);
        nomber.prev();

        Assertions.assertEquals(7, nomber.getCurrentRadioStation());
    }

    @Test

    public void prevRadioNomberMin() {

        nomber2.setCurrentRadioStation(0);
        nomber2.prev();

        Assertions.assertEquals(9, nomber2.getCurrentRadioStation());

    }

    @Test

    public void soundMaxMin() {
        Assertions.assertEquals(100, sound.getMaxSoundVovume());
        Assertions.assertEquals(0, sound.getMinSoundVolume());


    }

    @Test

    public void soundVolume() {

        sound.setSoundVolume(7);
        Assertions.assertEquals(7, sound.getSoundVolume());
    }

    @Test

    public void soundVolumeOverMax() {

        sound.setSoundVolume(105);
        Assertions.assertEquals(0, sound.getSoundVolume());
    }

    @Test

    public void soundVolumeOverMin() {

        sound.setSoundVolume(-1);
        Assertions.assertEquals(0, sound.getSoundVolume());
    }

    @Test

    public void increaseVolume() {

        sound.setSoundVolume(8);
        sound.increaseVolume();

        Assertions.assertEquals(9, sound.getSoundVolume());
    }

    @Test

    public void increaseVolume100() {

        sound.setSoundVolume(100);
        sound.increaseVolume();

        Assertions.assertEquals(100, sound.getSoundVolume());

    }

    @Test

    public void reductionVolume() {

        sound.setSoundVolume(8);
        sound.reductionVolume();

        Assertions.assertEquals(7, sound.getSoundVolume());
    }
    @Test

    public void reductionVolumeNull() {

        sound.setSoundVolume(0);
        sound.reductionVolume();

        Assertions.assertEquals(0, sound.getSoundVolume());
    }


}

