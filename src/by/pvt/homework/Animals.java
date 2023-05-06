package by.pvt.homework;

public class Animals {
    private String color;
    private int maxLifespan;
    private String foodType;

    public Animals(String color, int maxLifespan, String foodType) {
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;

    }
    public  void sing(){
        System.out.println("животное издает звук");
    }


}
