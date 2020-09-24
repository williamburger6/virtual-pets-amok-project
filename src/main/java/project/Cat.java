package project;

public class Cat {
    private String name;
    private String description;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public Cat(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel) {
        this.name = name;
        this.description = description;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void feedPet() {
        hungerLevel -=3;
    }

    public int getHunger() {
        return hungerLevel;
    }

    public void waterPet() {
        thirstLevel -=3;
    }

    public int getThirst() {
        return thirstLevel;
    }

    public void playPet() {
        boredomLevel -=3;
    }

    public int getBoredom() {
        return boredomLevel;
    }


}