package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {

    Dog underTest = new Dog ("Buddy","wild",4,4,4,4);
    @Test
    public void shouldDecreaseHungerBy3HealthBy1WhenFed(){
        underTest.feedPet();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 1);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }

    @Test
    public void shouldDecreaseThirstBy3WhenWatered(){
        underTest.waterPet();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 1);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }

    @Test
    public void shouldDecreaseBoredomBy3WhenPlaying(){
        underTest.playPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 1);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }

    @Test
    public void shouldDecreaseBoredomTo0IncreaseHungerBy1IncreaseThirstBy2WhenWalked(){
        underTest.walkPet();
        int currentBoredom = underTest.getBoredom();
        int currentThirst = underTest.getThirst();
        int currentHunger = underTest.getHunger();
        assertEquals(currentBoredom, 0);
        assertEquals(currentThirst, 6);
        assertEquals(currentHunger, 5);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }
}
