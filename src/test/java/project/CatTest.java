package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    Cat underTest = new Cat("Lucy","mean",4,4,4);

    @Test
    public void shouldDecreaseHungerBy3WhenFed(){
        underTest.feedPet();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 1);
    }

    @Test
    public void shouldDecreaseThirstBy3WhenWatered(){
        underTest.waterPet();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 1);
    }

    @Test
    public void shouldDecreaseBoredomBy3WhenPlaying() {
        underTest.playPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 1);
    }
}
