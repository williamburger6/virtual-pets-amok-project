package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboCatTest {

    RoboCat underTest = new RoboCat("Socks","timid",4,4,4);

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
}
