package project;

public class Cat extends OrganicPet {
    public Cat(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int healthLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel, healthLevel);
    }

    public int litterBoxLevel = 4;

    public int wasteLevel = healthLevel;

    public int getWaste() {
        return wasteLevel;
    }


    public void cleanLitterBox() {
        litterBoxLevel = 0;
    }

    public int getLitterBoxLevel() {
        return litterBoxLevel;
    }

    public void runCatTick() {
        litterBoxLevel = wasteLevel;
    }

}