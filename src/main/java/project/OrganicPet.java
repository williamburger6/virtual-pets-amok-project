package project;

public class OrganicPet {
    protected String name;
    protected String description;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;
    protected int healthLevel;

    public OrganicPet(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel, int healthLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.healthLevel = healthLevel;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void feedPet() {
        hungerLevel -= 3;
        healthLevel -= 1;
    }

    public int getHunger() {
        return hungerLevel;
    }

    public void waterPet() {
        thirstLevel -= 3;
        healthLevel -= 1;
    }

    public int getThirst() {
        return thirstLevel;
    }

    public void playPet() {
        boredomLevel -= 3;
        healthLevel -= 1;
    }

    public int getBoredom() {
        return boredomLevel;
    }

    public int getHealth() {
        return healthLevel;
    }
}
