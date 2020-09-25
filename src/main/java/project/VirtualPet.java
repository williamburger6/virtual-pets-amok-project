package project;

public class VirtualPet {
    protected String name;
    protected String description;

    public VirtualPet(String newName, String newDescription){
        name = newName;
        description = newDescription;

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
}
