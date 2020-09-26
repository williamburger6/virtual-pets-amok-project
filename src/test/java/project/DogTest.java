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

    @Test
    public void shouldReturnWasteOf0(){
        int currentWaste = underTest.getWaste();
        assertEquals(currentWaste,4);
    }

    @Test
    public void shouldDecreaseLitterBoxLevelTo0(){
        underTest.cleanDogCage();
        int currentDogCageLevel = underTest.getDogCageLevel();
        assertEquals(currentDogCageLevel,0);
    }

    @Test
    public void shouldRunTickCausingWasteToBe4(){
        underTest.runDogTick();
        int currentDogCageLevel = underTest.getDogCageLevel();
        assertEquals(currentDogCageLevel,4);
    }

}
