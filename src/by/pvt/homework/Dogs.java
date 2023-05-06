package by.pvt.homework;

public class Dogs extends Animals {
    private String name;
    private String breed;
    private int averageWeight;
    private static int kollDogs;

    public Dogs(String name, String breed, int averageWeight, String color, int maxLifespan, String foodType) {
        super(color, maxLifespan, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public void sing() {
        System.out.println(name + " издайет громкий лай.");
    }

}