public class Radio {
    private int minAmountRadioStation = 0;
    private int maxAmountRadioStation = 10;
    private int amountRadioStation = maxAmountRadioStation - 1;

    public Radio(int maxAmountRadioStation) {
        this.maxAmountRadioStation = maxAmountRadioStation;
        this.amountRadioStation = maxAmountRadioStation - 1;
    }
    public Radio(){}

    public int getMinAmountRadioStation() {
        return minAmountRadioStation;
    }

    public int getAmountRadioStation() {
        return amountRadioStation;
    }

    public void setMaxAmountRadioStation(int maxAmountRadioStation) {
        this.maxAmountRadioStation = maxAmountRadioStation;
    }
//    public void setMaxAmountRadioStation(int maxAmountRadioStation) {
//        this.maxAmountRadioStation = 10;

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newcurrentVolume) {
        if (newcurrentVolume < 0) {
            return;
        }
        if (newcurrentVolume > 100) {
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
        if (currentRadioStation > minAmountRadioStation) {
            target = currentRadioStation - 1;
            setCurrentRadioStation(target);
        } else {
            setCurrentRadioStation(amountRadioStation);
        }
    }

    public void next() {
        int target;
        if (currentRadioStation < amountRadioStation) {
            target = currentRadioStation + 1;
            setCurrentRadioStation(target);
        } else {
            setCurrentRadioStation(minAmountRadioStation);
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
