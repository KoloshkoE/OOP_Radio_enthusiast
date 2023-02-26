import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({"1", "9", "6", "3", "0"})
    public void setprevStationTest(int volumeSound) {
        Radio curnextstat = new Radio();
        int exepceted;
        curnextstat.setCurrentRadioStation(volumeSound);
        curnextstat.prev();
        if (volumeSound > 0) {
            exepceted = volumeSound - 1;
        } else {
            exepceted = 9;
        }
        int actual = curnextstat.getCurrentRadioStation();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"1", "9", "4", "7", "0"})
    public void setNextStationTest(int volumeSound) {
        Radio curnextstat = new Radio();
        int exepceted;
        curnextstat.setCurrentRadioStation(volumeSound);
        curnextstat.next();
        if (volumeSound < 9) {
            exepceted = volumeSound + 1;
        } else {
            exepceted = 0;
        }

        int actual = curnextstat.getCurrentRadioStation();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"0", "9", "4", "7", "10"})
    public void setCurvolSoundTest(int volumeSound) {
        Radio curvolsound = new Radio();
        int exepceted;
        curvolsound.setCurrentVolume(volumeSound);
        curvolsound.increaseVolume();
        if (volumeSound < 10) {
            exepceted = volumeSound + 1;
        } else {
            exepceted = volumeSound;
        }
        int actual = curvolsound.getCurrentVolume();
        Assertions.assertEquals(exepceted, actual);

    }

    @ParameterizedTest
    @CsvSource({"0", "8", "3", "5", "10"})
    public void setCurvolSound2Test(int volumeSound) {
        Radio curvolsound = new Radio();
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


}
