package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    Cat underTest = new Cat("Lucy","mean",4,4,4,4);

    @Test
    public void shouldDecreaseHungerBy3AndHealthBy1WhenFed(){
        underTest.feedPet();
        int currentHunger = underTest.getHunger();
        assertEquals(currentHunger, 1);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }

    @Test
    public void shouldDecreaseThirstBy3AndHealthBy1WhenWatered(){
        underTest.waterPet();
        int currentThirst = underTest.getThirst();
        assertEquals(currentThirst, 1);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }

    @Test
    public void shouldDecreaseBoredomBy3AndHealthBy1WhenPlaying() {
        underTest.playPet();
        int currentBoredom = underTest.getBoredom();
        assertEquals(currentBoredom, 1);
        int currentHealth = underTest.getHealth();
        assertEquals(currentHealth,3);
    }

    @Test
    public void shouldDecreaseLitterBoxLevelTo0(){
        underTest.cleanLitterBox();
        int currentLitterBoxLevel = underTest.getLitterBoxLevel();
        assertEquals(currentLitterBoxLevel,0);
    }

    @Test
    public void shouldReturnWasteOf4(){
        int currentWaste = underTest.getWaste();
        assertEquals(currentWaste,4);
    }

    @Test
    public void shouldRunTickReturnWasteOf4(){
        underTest.runCatTick();
        int currentLitterBoxLevel = underTest.getLitterBoxLevel();
        assertEquals(currentLitterBoxLevel,4);
    }



}
