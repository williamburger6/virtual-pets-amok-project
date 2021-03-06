package project;

public class RoboPet {
    protected String name;
    protected String description;
    protected int oilLevel;
    protected int performanceLevel;
    protected int boredomLevel;

    public RoboPet(String name, String description, int oilLevel, int performanceLevel, int boredomLevel) {
        this.name = name;
        this.description = description;
        this.oilLevel = oilLevel;
        this.performanceLevel = performanceLevel;
        this.boredomLevel = boredomLevel;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void oilPet() {
        oilLevel -= 3;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void maintenancePet() {
        performanceLevel -= 3;
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
}
