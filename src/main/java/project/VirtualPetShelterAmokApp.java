package project;

import java.util.Scanner;

public class VirtualPetShelterAmokApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter myPetShelter = new VirtualPetShelter();
        Cat cat1 = new Cat("Chuck", "grey", 3, 3, 3, 3);
        Dog dog1 = new Dog("Sadie", "white", 1, 2, 3, 4);
        RoboDog roboDog1 = new RoboDog("Louie", "brown", 3, 2, 1);
        RoboCat roboCat1 = new RoboCat("Chuck", "smart", 3, 3, 3);

        myPetShelter.intakeCat(cat1);
        myPetShelter.intakeDog(dog1);
        myPetShelter.intakeRoboDog(roboDog1);
        myPetShelter.intakeRoboCat(roboCat1);

        String userChoice;

        do {
            System.out.println("Welcome. Here are the available animals:");
            System.out.println("What would you like to do?");
            System.out.println("Press 1 to feed pet");
            System.out.println("Press 2 to water pet");
            System.out.println("Press 3 to oil a robopet");
            System.out.println("Press 4 to give a robopet maintenance");
            System.out.println("Press 5 to play with a pet or robopet");
            System.out.println("Press 6 to walk a dog");
            userChoice = input.nextLine();

        if(userChoice.equals("1")){
            System.out.println("Which cat would you like to feed?");
            System.out.println("Press 1 for cat");
            System.out.println("Press 2 for dog");
            String userFeedChoice;
            userFeedChoice = input.nextLine();
            if(userFeedChoice.equals("1"))
                myPetShelter.showCats();
            String catToFeed = input.nextLine();
            myPetShelter.feedPet(catToFeed);
            System.out.println(catToFeed + " ate it all up");
            if(userFeedChoice.equals("2"))
                myPetShelter.showDogs();
            String dogToFeed = input.nextLine();
            myPetShelter.feedPet(dogToFeed);
            System.out.println(dogToFeed + "ate it all up");
        }
        else if(userChoice.equals("2")){
            System.out.println("Which type of animal would you like to give water");
            System.out.println("Press 1 for cat");
            System.out.println("Press 2 for dog");
            String userWaterChoice;
            userWaterChoice = input.nextLine();
            if(userWaterChoice.equals("1"))
            myPetShelter.showCats();
            String catToWater = input.nextLine();
            myPetShelter.waterPet(catToWater);
            System.out.println(catToWater + " drank every last drop");
            if(userWaterChoice.equals("2"))
                myPetShelter.showDogs();
            String dogToWater = input.nextLine();
            myPetShelter.waterPet(dogToWater);
            System.out.println(dogToWater + "drank every last drop");

        }
        else if(userChoice.equals("3")){
            System.out.println("Which type of robopet would you like to oil");
            System.out.println("Press 1 for robocat");
            System.out.println("Press 2 for robodog");
            String userOilChoice;
            userOilChoice = input.nextLine();
            if(userOilChoice.equals("1"))
                myPetShelter.showRoboCats();
            String roboCatToOil = input.nextLine();
            myPetShelter.oilPet(roboCatToOil);
            System.out.println(roboCatToOil + " is loving the new oil");
            if(userOilChoice.equals("2"))
                myPetShelter.showRoboDogs();
            String roboDogToOil = input.nextLine();
            myPetShelter.oilPet(roboDogToOil);
            System.out.println(roboDogToOil + " is loving the new oil");

        }
        else if(userChoice.equals("4")) {
            System.out.println("Which type of robopet would you like to perform maintenance on?");
            System.out.println("Press 1 for robocat");
            System.out.println("Press 2 for robodog");
            String userMaintenanceChoice;
            userMaintenanceChoice = input.nextLine();
            if (userMaintenanceChoice.equals("1"))
                myPetShelter.showRoboCats();
            String roboCatForMaintenance = input.nextLine();
            myPetShelter.maintenancePet(roboCatForMaintenance);
            System.out.println(roboCatForMaintenance + " is feeling brand new");
            if (userMaintenanceChoice.equals("2"))
                myPetShelter.showRoboDogs();
            String roboDogForMaintenance = input.nextLine();
            myPetShelter.maintenancePet(roboDogForMaintenance);
            System.out.println(roboDogForMaintenance + " is feeling brand new");
        }


        else if (userChoice.equals("5")){
            System.out.println("Which type of animal would you like to play with?");
            System.out.println("Press 1 for cat");
            System.out.println("Press 2 for dog");
            System.out.println("Press 3 for robocat");
            System.out.println("Press 4 for robodog");
            String userPlayChoice;
            userPlayChoice = input.nextLine();
            if(userPlayChoice.equals("1"))
                myPetShelter.showCats();
            String catToPlayWith = input.nextLine();
            myPetShelter.playPet(catToPlayWith);
            System.out.println(catToPlayWith + " had lots of fun");
            if(userPlayChoice.equals("2"))
                myPetShelter.showDogs();
            String dogToPlayWith = input.nextLine();
            myPetShelter.playPet(dogToPlayWith);
            System.out.println(dogToPlayWith + "had lots of fun");
            if(userPlayChoice.equals("3"))
                myPetShelter.showRoboCats();
            String roboCatToPlayWith = input.nextLine();
            myPetShelter.playRoboPet(roboCatToPlayWith);
            System.out.println(roboCatToPlayWith + " had lots of fun");
            if(userPlayChoice.equals("4"))
                myPetShelter.showRoboDogs();
            String roboDogToPlayWith = input.nextLine();
            myPetShelter.playRoboPet(roboDogToPlayWith);
            System.out.println(roboDogToPlayWith + " had lots of fun");

        }
    }else if (userChoice.equals("6") {
            System.out.println("Would you like to walk a dog or a robodog?");
            System.out.println("Press 1 for dog");
            System.out.println("Press 2 for robodog");
            String userWalkChoice;
            userWalkChoice = input.nextLine();
            if(userWalkChoice.equals("1"))
                myPetShelter.showDogs();
            String catToWater = input.nextLine();
            myPetShelter.walkPet(catToWater);
            System.out.println(catToWater + " enjoyed the walk");
            if(userWalkChoice.equals("2"))
                myPetShelter.showRoboDogs();
            String roboDogToWalk = input.nextLine();
            myPetShelter.walkPet(roboDogToWalk);
            System.out.println(roboDogToWalk + "drank every last drop");

        }
        ;

            System.out.println("Thanks for visiting!");



}


        }
}