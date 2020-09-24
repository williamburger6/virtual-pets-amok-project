package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    @Test
    public void shouldDecreaseHungerBy3WhenFed(){
        Dog underTest = new Dog ("Buddy","wild",4,4,4);
        underTest.feedPet();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 1);
    }

    @Test
    public void shouldDecreaseThirstBy3WhenWatered(){
        Dog underTest = new Dog ("Buddy","wild",4,4,4);
        underTest.waterPet();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 1);
    }

    @Test
    public void shouldDecreaseBoredomBy3WhenPlaying(){
        Dog underTest = new Dog ("Buddy","wild",4,4,4);
        underTest.playPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 1);
    }

    @Test
    public void shouldDecreaseBoredomTo0IncreaseHungerBy1IncreaseThirstBy2WhenWalked(){
        Dog underTest = new Dog ("Buddy","wild",4,4,4);
        underTest.walkPet();
        int currentBoredom = underTest.getBoredom();
        int currentThirst = underTest.getThirst();
        int currentHunger = underTest.getHunger();
        assertEquals(currentBoredom, 0);
        assertEquals(currentThirst, 6);
        assertEquals(currentHunger, 5);

    }
}
