package project;

public class Dog extends OrganicPet {

    public Dog(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int healthLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel, healthLevel);
    }

    public void walkPet(){
        boredomLevel =0;
        thirstLevel +=2;
        hungerLevel +=1;
        healthLevel -=1;
    }
}
