package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio curvolsound = new Radio();

    @ParameterizedTest
    @CsvSource({"1", "9", "6", "3", "0"})
    public void setprevStationTest(int volumeSound) {
        Radio curprevtstat = new Radio();
        int exepceted;
        curprevtstat.setCurrentRadioStation(volumeSound);
        curprevtstat.prev();
        if (volumeSound > curprevtstat.getMinAmountRadioStation()) {
            exepceted = volumeSound - 1;
        } else {
            exepceted = 9;
        }
        int actual = curprevtstat.getCurrentRadioStation();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"1", "9", "4", "7", "0"})
    public void setNextStationTest(int volumeSound) {
        Radio curnextstat = new Radio();
        int exepceted;
        curnextstat.setCurrentRadioStation(volumeSound);
        curnextstat.next();
        if (volumeSound < curnextstat.getAmountRadioStation()) {
            exepceted = volumeSound + 1;
        } else {
            exepceted = 0;
        }

        int actual = curnextstat.getCurrentRadioStation();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"0", "9", "40", "7", "100"})
    public void setCurvolSoundTest(int volumeSound) {
        int exepceted;
        curvolsound.setCurrentVolume(volumeSound);
        curvolsound.increaseVolume();
        if (volumeSound < 100) {
            exepceted = volumeSound + 1;
        } else {
            exepceted = volumeSound;
        }
        int actual = curvolsound.getCurrentVolume();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"0", "80", "3", "54", "10"})
    public void setCurvolSound2Test(int volumeSound) {
        int exepceted;
        curvolsound.setCurrentVolume(volumeSound);
        curvolsound.lowerVolume();
        if (volumeSound > 0) {
            exepceted = volumeSound - 1;
        } else {
            exepceted = volumeSound;
        }
        int actual = curvolsound.getCurrentVolume();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"0", "80", "3", "54", "10"})
    public void setAmountRadioStationTest(int count) {
        Radio amoutRS = new Radio(count);
        int expected = count - 1;

        Assertions.assertEquals(expected, amoutRS.getAmountRadioStation());
    }


}
