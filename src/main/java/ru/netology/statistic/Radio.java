
package ru.netology.statistic;
public class Radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newcurrentVolume) {
        if (newcurrentVolume < 0) {
            return;
        }
        if (newcurrentVolume > 10) {
            return;
        }
        this.currentVolume = newcurrentVolume;
    }

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newcurrentRadioStation) {
        this.currentRadioStation = newcurrentRadioStation;
    }

    public void prev() {
        int target;
        if (currentRadioStation > 0) {
            target = currentRadioStation - 1;
            setCurrentRadioStation(target);
        } else {
            setCurrentRadioStation(9);
        }
    }

    public void next() {
        int target;
        if (currentRadioStation < 9) {
            target = currentRadioStation + 1;
            setCurrentRadioStation(target);
        } else {
            setCurrentRadioStation(0);
        }
    }

    public void lowerVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }


    public void increaseVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);


    }
}
