package by.pvt.homework;

public class AnimalsZoo {
    private Animals[] animals;

    public static void  addAnimals(Animals[] animalsInZoo, Animals[] animals) {
        int j=0;
    for(int i=0; i<animalsInZoo.length;i++){
        if(animalsInZoo[i]==null && j!=animals.length){
            animalsInZoo[i]=animals[j];
            j++;
        }
    }
    }
    public static void soundProduction(Animals[] animalsList){
        for(int i=0;i<animalsList.length;i++){
            animalsList[i].sing();
        }

    }
}