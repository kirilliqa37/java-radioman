package ru.netology.radioman;

public class Radio {
    private int currentRadioStation;
    private int numberOfRadioStations = 10;
    private int minCurrentRadioStation = 0;
    private int maxCurrentRadioStation = 9;
    private int soundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVovume = 100;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
        this.maxCurrentRadioStation = numberOfRadioStations - 1;
    }

    public Radio() {
    }


    public int getMinCurrentRadioStation() {
        return minCurrentRadioStation;
    }

    public int getMaxCurrentRadioStation() {
        return maxCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minCurrentRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxCurrentRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation >= maxCurrentRadioStation) {
            setCurrentRadioStation(minCurrentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prev() {
        if (currentRadioStation <= minCurrentRadioStation) {
            setCurrentRadioStation(maxCurrentRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVovume() {
        return maxSoundVovume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVovume) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < maxSoundVovume) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = 100;
        }

    }

    public void reductionVolume() {
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = 0;
        }
    }


}




