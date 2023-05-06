package by.pvt.homework;


public class Main {
    public static void main(String[] args) {
        Animals[] dogsList = AnimalsList.createAnArrayOfDogs();
        Animals[] birdsList = AnimalsList.createAnArrayOfBirds();
        Animals[] lionsList = AnimalsList.createAnArrayOfLions();
        Animals[] animalsInZoo = new Animals[9];
        AnimalsZoo.addAnimals(animalsInZoo, dogsList);
        AnimalsZoo.addAnimals(animalsInZoo, lionsList);
        AnimalsZoo.addAnimals(animalsInZoo, birdsList);
        AnimalsZoo.soundProduction(animalsInZoo);
    }

}

