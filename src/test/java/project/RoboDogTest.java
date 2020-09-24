package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboDogTest {

    RoboDog underTest = new RoboDog ("Buddy","wild",4,4,4);

    @Test
    public void shouldDecreaseFuelBy3WhenOiled(){
        underTest.oilPet();
        int currentOilLevel = underTest.getOilLevel();
        assertEquals(currentOilLevel, 1);
    }

    @Test
    public void shouldDecreasePerformanceLevelBy3WhenMaintenanced(){
        underTest.maintenancePet();
        int currentPerformanceLevel = underTest.getPerfomanceLevel();
        assertEquals(currentPerformanceLevel, 1);
    }

    @Test
    public void shouldDecreaseBoredomBy3WhenPlaying() {
        underTest.playRoboPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 1);
    }

    @Test
    public void shouldDecreaseBoredomTo0IncreaseOilBy1IncreasePerformanceLevelBy2WhenWalked(){
        underTest.walkPet();
        int currentBoredom = underTest.getBoredom();
        int currentPerformanceLevel = underTest.getPerfomanceLevel();
        int currentOilLevel = underTest.getOilLevel();
        assertEquals(currentBoredom, 0);
        assertEquals(currentPerformanceLevel, 6);
        assertEquals(currentOilLevel, 5);
    }
}
