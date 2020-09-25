package project;

public class RoboDog extends RoboPet {
    public RoboDog(String name, String description, int oilLevel, int performanceLevel, int boredomLevel) {
        super(name, description, oilLevel, performanceLevel, boredomLevel);
    }
    public void walkPet() {
        boredomLevel =0;
        performanceLevel +=2;
        oilLevel +=1;
    }
}
