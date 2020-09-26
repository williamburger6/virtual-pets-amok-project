package project;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, Dog> shelterDogs = new HashMap<String, Dog>();

    public void intakeDog(Dog dog) {
        shelterDogs.put(dog.getName(), (Dog) dog);
    }

    public void adoptDog(Dog dog) {
        shelterDogs.remove(dog.getName());
    }

    public Collection<Dog> getAllDogNames() {
        return shelterDogs.values();
    }

    public void showDogs() {
        for (Dog name : getAllDogNames()) {
            System.out.println(name.getName() + " is " + name.getDescription() + " their hunger level is " + name.getHunger() + " their thirst level " + name.getThirst() + " their boredom level is " + name.getBoredom() + "their health is" + name.getHealth());
        }
    }


    private Map<String, Cat> shelterCats = new HashMap<String, Cat>();

    public void intakeCat(Cat cat) {
        shelterCats.put(cat.getName(), (Cat) cat);
    }

    public void adoptCat(Cat cat) {
        shelterCats.remove(cat.getName());
    }

    private Map<String, RoboCat> shelterRoboCats = new HashMap<String, RoboCat>();

    public void intakeRoboCat(RoboCat roboCat) {
        shelterRoboCats.put(roboCat.getName(), (RoboCat) roboCat);
    }

    public void adoptRoboCat(RoboCat roboCat) {
        shelterRoboCats.remove(roboCat.getName());
    }

    private Map<String, RoboDog> shelterRoboDogs = new HashMap<String, RoboDog>();

    public void intakeRoboDog(RoboDog roboDog) {
        shelterRoboDogs.put(roboDog.getName(), (RoboDog) roboDog);
    }

    public void adoptRoboDog(RoboDog roboDog) {
        shelterDogs.remove(roboDog.getName());
    }

    public Collection<Cat> getAllCatNames() {
        return shelterCats.values();
    }
        public void showCats () {
            for (Cat name : getAllCatNames()) {
                System.out.println(name.getName() + " is " + name.getDescription() + " their hunger level is " + name.getHunger() + " their thirst level " + name.getThirst() + " their boredom level is " + name.getBoredom() + "their health is" + name.getHealth());
            }
    }
    public Collection<RoboCat> getAllRoboCatNames() {
        return shelterRoboCats.values();
    }
    public void showRoboCats () {
        for (RoboCat name : getAllRoboCatNames()) {
            System.out.println(name.getName() + " is " + name.getDescription() + " their oil level is " + name.getOilLevel() + " their performance level is" + name.getPerfomanceLevel() + " their boredom level is " + name.getBoredom());
        }
    }

    public Collection<RoboDog> getAllRoboDogNames() {
        return shelterRoboDogs.values();
    }
    public void showRoboDogs () {
        for (RoboDog name : getAllRoboDogNames()) {
            System.out.println(name.getName() + " is " + name.getDescription() + " their oil level is " + name.getOilLevel() + " their performance level is" + name.getPerfomanceLevel() + " their boredom level is " + name.getBoredom());
        }
    }
}
