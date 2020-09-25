package project;

public class Dog extends OrganicPet {

    public Dog(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int healthLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel, healthLevel);
    }

    public int dogCageLevel;
    public int wasteLevel = healthLevel;

    public int getWaste(){
        return wasteLevel;
    }

    public void walkPet(){
        boredomLevel =0;
        thirstLevel +=2;
        hungerLevel +=1;
        healthLevel -=1;
    }
    public void cleanDogCage(){
        dogCageLevel = 0;
    }

    public int getDogCageLevel() {
        return dogCageLevel;
    }



}
