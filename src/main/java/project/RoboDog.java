package project;

public class RoboDog {

    private String name;
    private String description;
    private int oilLevel;
    private int performanceLevel;
    private int boredomLevel;



    public RoboDog(String name, String description, int oilLevel, int performanceLevel, int boredomLevel) {
        this.name = name;
        this.description = description;
        this.oilLevel = oilLevel;
        this.performanceLevel = performanceLevel;
        this.boredomLevel = boredomLevel;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void oilPet() {
        oilLevel -=3;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void maintenancePet() {
        performanceLevel -=3;
    }

    public int getPerfomanceLevel() {
        return performanceLevel;
    }

    public void playRoboPet() {
        boredomLevel -= 3;
    }

    public int getBoredom() {
        return boredomLevel;
    }

    public void walkPet() {
        boredomLevel =0;
        performanceLevel +=2;
        oilLevel +=1;
    }
}
