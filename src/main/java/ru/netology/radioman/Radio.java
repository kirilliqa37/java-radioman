package ru.netology.radioman;

public class Radio {
    public int currentRadioStation;
    public int soundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public void setCurrentRadioStationMax(){
        currentRadioStation = 9;
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }else {
            currentRadioStation = 9;
        }
    }

    public int getSoundVolume(){
        return soundVolume;
    }
    public void setSoundVolume(int newSoundVolume){
        if(newSoundVolume < 0){
            return;
        }
        if (newSoundVolume > 10){
            return;
        }
        soundVolume = newSoundVolume;
    }
    public void setSoundVolumeMax(){
        soundVolume = 10;
    }
    public void increaseVolume(){
        if(soundVolume < 10){
            soundVolume = soundVolume + 1;
        }else {
            soundVolume = 10;
        }

    }
    public void reductionVolume(){
        if (soundVolume > 0){
            soundVolume = soundVolume - 1;
        }else {
            soundVolume = 0;
        }
    }

}

